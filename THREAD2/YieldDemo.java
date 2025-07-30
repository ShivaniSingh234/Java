package THREAD2;

//In this program output may(vary) based on system


public class YieldDemo extends Thread {
    public void run() {
        Thread.yield();                       // -->wants thread-0 to stop and main thread to execute
        for (int i = 1; i <= 5; i++) {

            System.out.println(i + " : " + Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        YieldDemo y1 = new YieldDemo();
        y1.start();
        Thread.yield();                  // -->wants main method to stop and provide chance to other thread

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
