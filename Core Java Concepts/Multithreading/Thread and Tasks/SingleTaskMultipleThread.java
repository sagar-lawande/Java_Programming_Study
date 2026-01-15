public class SingleTaskMultipleThread extends Thread{

public void run(){
    System.out.println("Single Task...Executed");
    System.out.println("Thread 1 , 2, 3 can done same task...");
}

    public static void main(String[]args){
        System.out.println("Single Task Multiple Thread......."); 
        SingleTaskMultipleThread obj =new SingleTaskMultipleThread();
        obj.start();
        System.out.println();
        SingleTaskMultipleThread obj1 =new SingleTaskMultipleThread();
        obj1.start();

    }
}