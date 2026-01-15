public class Sleep extends Thread{

    public void run(){
        
    }
    public static void main(String[]args){
        System.out.println("Program for the Stop execution for some time...");
        Sleep s=new Sleep();
        s.start();
        for(int i=0;i<=10;i++){
            try{
        s.sleep(1000);
        
        }catch(Exception e){
            System.out.println(e);
        }
            System.out.println(i);
        }
        
        

    }
}