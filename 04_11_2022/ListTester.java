package ASSIGNMENT_04_11_2022;

import java.util.ArrayList;
import java.util.List;

 class ListTester implements Runnable {
    private List<Integer> a;

    public ListTester(List<Integer> a) {
        this.a = a;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; ++i) {
                a.add(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
        }
    }



public static void main(String[] args) throws Exception {
    ArrayList<Integer> a = new ArrayList<Integer>();

    Thread t1 = new Thread(new ListTester(a));
    Thread t2 = new Thread(new ListTester(a));

    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(a.size());
    for (int i = 0; i < a.size(); ++i) {
        System.out.println(i + "  " + a.get(i));
    }
}}