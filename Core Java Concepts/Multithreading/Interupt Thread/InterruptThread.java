public class InterruptThread extends Thread{

    public void run(){
        try{
        for(int i=0;i<10;i++){
             System.out.println(i);
            Thread.sleep(1000);
           

        }
    }catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String[]args){
        System.out.println("Program for the Use of Interrupt....");
        InterruptThread t=new InterruptThread();
        t.start();
        
        t.interrupt();
        

    }

}