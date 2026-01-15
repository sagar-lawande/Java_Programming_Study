public class SingleTaskSingleThread extends Thread{

    public void run(){
        System.out.println("\n<<<<<<<<SINGLE TASK USING SINGLE THREAD IS DONE>>>>>>");
        System.out.println("\nThread 1 Start ...");
    }
    public static void main(String[]args){
        System.out.println("Single Task using Single Thread.....");
        SingleTaskSingleThread obj =new SingleTaskSingleThread();
        obj.start();



    }
}