public class Yield extends Thread{

    public void run(){
        System.out.println("Thread 1 ");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[]args){
        System.out.println("Program for use of Yield() method...");
        


        for(int j=90;j<100;j++){
            System.out.println(j);
            

        }
            Yield y=new Yield();
            y.yield();     // stop execution of the current thread and gives chane to the other thread
            
            y.start();
            

        }
    }
