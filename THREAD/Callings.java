package THREAD;

//multiple thread creation
class InnerCallings extends Thread {
    public void run() {
        System.out.println("Thread1 is called");
    }

}

class InnerCallings2 extends Thread {
    public void run() {
        System.out.println("Thread2 is called");
    }

}

public class Callings {

    public static void main(String[] args) {
        InnerCallings c1 = new InnerCallings();
        c1.start(); // single call from single thread

        InnerCallings c2 = new InnerCallings();
        c2.start(); // calling same task from another thread

        InnerCallings2 c3 = new InnerCallings2();
        c3.start();
    }
}
