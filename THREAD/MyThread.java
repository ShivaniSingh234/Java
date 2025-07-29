package THREAD;

public class MyThread extends Thread {

    public void run() {
        System.out.println("Thread Task is ececuted by: " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        /*
         * System.out.println("Hello!");
         * System.out.println(Thread.currentThread().getName()); //getting the name of
         * main thread
         * Thread.currentThread().setName("Shivani"); //changing the name of main thread
         * System.out.println("New Thread name: " + Thread.currentThread().getName());
         */

        System.out.println("Hello! is printed by: " + Thread.currentThread().getName());
        
        MyThread t = new MyThread();
        t.setName("Shivani, first call");
        t.start();

        MyThread t2 = new MyThread();
        t2.setName("Second Call");
        t2.start();
    }
}
