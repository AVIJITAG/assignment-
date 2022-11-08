/* try to create class implementing Runnable interface and override run method to print something.
   Then create 4 thread & start all of them to call the same run method.*/


package ASSIGNMENT_04_11_2022;

public class Runnable_00 {                                                     //main class

	public static void main(String[] args)                                       // main method
	{
		System.out.println("Main thread is- " +Thread.currentThread().getName());      // print statement 
		Thread t1 = new Thread(new Runnable_00().new RunnableImpl());                  // thread object create 
		t1.start();                                                                      // call object
	}

	private class RunnableImpl implements Runnable {                                     // main class implements runnable

		public void run()                                                               // run method create 
		{
			System.out.println(Thread.currentThread().getName()                           // print call
							+ ", executing run() method!");
		}
	}
}
