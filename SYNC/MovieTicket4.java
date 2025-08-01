package SYNC;

//using inter-thread communication methods

class TotalEarnings extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                total = total + 100; // 100 is the cost of movie ticket
            }

            this.notify();
        }

    }
}

public class MovieTicket4 {
    public static void main(String[] args) throws InterruptedException {

        TotalEarnings t = new TotalEarnings();
        t.start();

        synchronized (t) {
            t.wait();
            System.out.println("Total earnings Rs: " + t.total);

        }
    }
}
