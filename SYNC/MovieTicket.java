package SYNC;


//project without synchronization leads to inconsistency

class BookHallSeat
{
    int total_seat = 10;
    void bookSeat(int seats)
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


public class MovieTicket extends Thread{
    static BookHallSeat b;
    int seats;
    public void run()
    {
         b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookHallSeat();
        MovieTicket m1 = new MovieTicket();
        m1.seats = 7;
        m1.start();

        MovieTicket m2 = new MovieTicket();
        m2.seats = 6;
        m2.start();
    }
}
