public class ThreadMethod extends Thread{

    public void run(){
        System.out.println("Thread Executed....");
         
        
    }
    public static void main(String[]args){
        System.out.println("Program for the Thread Methods....");
        System.out.println("by default name of Thread : "+Thread.currentThread().getName());
        //gives thread name

        Thread.currentThread().setName("SAGAR");
        System.out.println("New name of the Thread is : "+Thread.currentThread().getName());
        ThreadMethod t=new ThreadMethod();
        Thread.currentThread().setName("Thread1");
        System.out.println(Thread.currentThread().getName());//get current thread name....
        System.out.println(Thread.currentThread().isAlive());// check meain thread is alive or not
        System.out.println(t.isAlive());// user created thread alive or not
        
        t.start();
       
        

    }
}