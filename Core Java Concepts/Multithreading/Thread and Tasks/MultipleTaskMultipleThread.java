public class MultipleTaskMultipleThread extends Thread{

    public void  run(){
        System.out.println("Task 1");
       }



    public static void  main(String[]args){
        System.out.println("Program for the Multile Task and Multiple threads....");
       
       MultipleTaskMultipleThread t1=new MultipleTaskMultipleThread();
       t1.start();
       Task2 t2=new Task2();
       t2.start();

    }
    
}
