public class ThreadCreationByThreadClass extends Thread{

    public void run(){
        //thread task....
    }

    public static void main(String[]args){
        System.out.println("Program for Thread Creation using Thread Class Extends");
            ThreadCreationByThreadClass obj =new ThreadCreationByThreadClass();
            obj.start();
        }
        
    }
