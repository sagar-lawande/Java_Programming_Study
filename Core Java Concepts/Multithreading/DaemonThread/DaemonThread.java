public class DaemonThread extends Thread{

    public void run(){
        System.out.println("Thread 1 is created as Daemon Thread");

        
    }
    public static void main(String[]args){
        System.out.println("Program for Daemon Thread.....");
        DaemonThread d=new DaemonThread();
        d.setDaemon(true);
        d.start();




    }
}