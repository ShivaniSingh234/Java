package THREAD;

public class Basic extends Thread {

    // 1st way
    public void run() {
        // thread task
        System.out.println("Thread creation using Thread class.");
    }

    public static void main(String[] args) {
        Basic t = new Basic();
        t.start();
        // t.start(); again invoking is not possible ,and will throw an exception
    }

}
