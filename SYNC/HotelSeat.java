package SYNC;

// synchronized static is used to achieve class lock

class BookTableSeat {
    static  int total_table = 20;

    synchronized static void bookTable(int seats) {
        if (total_table >= seats) {
            System.out.println(seats + " Tables booked successfully!!");
            total_table = total_table - seats;
            System.out.println("Tables left:" + total_table);
        } else {
            System.out.println("Table cannot be booked...!!");
            System.out.println("Remaining Tables : " + total_table);
        }
    }
}

class MyThread1 extends Thread {
    BookTableSeat b;
    int seats;

    MyThread1(BookTableSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookTable(seats);
    }
}

class MyThread2 extends Thread {
    BookTableSeat b;
    int seats;

    MyThread2(BookTableSeat b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookTable(seats);
    }
}

public class HotelSeat {
    public static void main(String[] args) {
        BookTableSeat b1 = new BookTableSeat();
        MyThread1 t1 = new MyThread1(b1, 7);
        t1.start();

        MyThread1 t2 = new MyThread1(b1, 6);
        t2.start();

        // ----------------

        BookTableSeat b2 = new BookTableSeat();
        MyThread1 t3 = new MyThread1(b1, 5);
        t3.start();

        MyThread1 t4 = new MyThread1(b1, 9);
        t4.start();
    }
}
