public class Priority extends Thread{

    public void run(){
        System.out.println("Thread 1 Child Thread");//check priority of child thread
        Thread.currentThread().setPriority(10);
        System.out.println("Child thread priority is = ");
        System.out.println(Thread.currentThread().getPriority());
        
    }
    public static void main(String[]args){

        System.out.println("Program for PRIORITY....");
        System.out.println("\nMain Thread Priority is : ");
        System.out.println(Thread.currentThread().getPriority());//priority of main Thread is 5 means NORM
        Priority p=new Priority();
        p.start();


    }
}