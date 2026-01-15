public class ThreadCreationUsingInterface implements Runnable{
    public static void main(String[]args){
        System.out.println("Program for the Thread Creation using Runnable interface..");
        ThreadCreationUsingInterface t=new ThreadCreationUsingInterface();
        Thread th=new Thread(t); //create obj of thread class and provide reference of main class obj...
        th.start();

    }
    public void run(){
        //thread task
    }

}
