package THREAD2;

public class DaemonTest extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Child Thread");
    }

    public static void main(String[] args) {

        System.out.println("Main Thread");
        DaemonTest t = new DaemonTest();
        t.setDaemon(true);
        // t.setDaemon(false); -->outputs child Thread
        t.start();
    }
}
