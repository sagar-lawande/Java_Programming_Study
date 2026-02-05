public class SeatBookApp extends Thread{
    int seat;
    Book b=new Book();
    public void run(){
        b.book(seat);

       // System.out.println("Thread Executed......");
    }

    public static void main(String[]args){
        SeatBookApp s=new SeatBookApp();
        s.seat=5;
        s.start();

        SeatBookApp r=new SeatBookApp();
        r.seat=42;
        r.start();

        SeatBookApp p=new SeatBookApp();
        p.seat=1;
        p.start();
        

    }
}