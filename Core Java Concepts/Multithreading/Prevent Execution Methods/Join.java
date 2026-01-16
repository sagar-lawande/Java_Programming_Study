public class Join extends Thread {

    public void run() {
        System.out.println("Child Thread Started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread " + i);
        }
        System.out.println("Child Thread Ended");
    }

    public static void main(String[] args) {

        Join j = new Join();           //main thread wait for child thread then it execute
        j.start();    
        

        try {
            // Main thread waits for child thread to complete
            j.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("<<<<<< Program for the use Of JOIN METHOD >>>>>>>>");
        for (int i = 0; i < 10; i++) {
            try{
            j.sleep(1000);
        }catch(Exception e){
            System.out.println(e);
        }
       
            System.out.println("Main Thread " + i);
        }
    }
}
