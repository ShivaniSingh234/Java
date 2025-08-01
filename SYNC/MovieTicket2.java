package SYNC;


//synchronized method is used to achieve mutual exclusion and object lock
class BookHallSeat2
{
    int total_seat = 10;
    synchronized void bookSeat(int seats)
    {
        if(total_seat>=seats)
        {
            System.out.println(seats+": Seats booked successfully!!");
            total_seat = total_seat-seats;
            System.out.println("Seats left:" + total_seat);
        }
        else
        {
            System.out.println("Seat cannot be booked...!!");
            System.out.println("remaining seats : " + total_seat);
        }
    }
}


public class MovieTicket2 extends Thread{
    static BookHallSeat2 b;
    int seats;
    public void run()
    {
         b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookHallSeat2();
        MovieTicket2 m1 = new MovieTicket2();
        m1.seats = 7;
        m1.start();

        MovieTicket2 m2 = new MovieTicket2();
        m2.seats = 6;
        m2.start();
    }
}
