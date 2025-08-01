package SYNC;

class BookHallSeat3 {
    int total_seat = 10;

    void bookSeat(int seats) {
        System.out.println("Hi" + Thread.currentThread().getName());
        System.out.println("Hi" + Thread.currentThread().getName());
        System.out.println("Hi" + Thread.currentThread().getName());


        // synchronized block is used to achieve a particular block of code to be synchronized

        synchronized (this) {
            if (total_seat >= seats) {
                System.out.println(seats + ": Seats booked successfully!!");
                total_seat = total_seat - seats;
                System.out.println("Seats left:" + total_seat);
            } else {
                System.out.println("Seat cannot be booked...!!");
                System.out.println("remaining seats : " + total_seat);
            }
        }

    }
}

public class MovieTicket3 extends Thread {
    static BookHallSeat3 b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookHallSeat3();
        MovieTicket3 m1 = new MovieTicket3();
        m1.seats = 7;
        m1.start();

        MovieTicket3 m2 = new MovieTicket3();
        m2.seats = 6;
        m2.start();
    }
}
