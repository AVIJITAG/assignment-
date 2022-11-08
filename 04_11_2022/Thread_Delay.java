/*1. Write a thread to print the thread name with a 2 sec delay with main thread.
     now write the same program using Runnable interface*/
package ASSIGNMENT_04_11_2022;

public class Thread_Delay implements Runnable {                // main class implements with runnable
    private final int DELAY;                                   // final int DELAY

    public Thread_Delay(int delay) {                           
        this.DELAY = delay;
    }

    @Override                                                // override 
    public void run() {                                      // run method create
        try {                                                // try _ catch block 
            Thread.sleep(DELAY);
            System.out.println("Task Executed");                 // print statement 
        } catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {          // main method throws I..Ex..
        Thread thread1 = new Thread(new Thread_Delay(2000));
        thread1.start();
        Thread.sleep(200);
        Thread thread2 = new Thread(new Thread_Delay (2000));
        thread2.start();
        System.out.println("All threads are started");                            // fist print this line 
    }

}