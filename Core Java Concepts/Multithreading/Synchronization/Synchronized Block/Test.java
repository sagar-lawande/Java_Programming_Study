public class Test extends Thread{
   static  Bank b=new  Bank();
    int  amt;
    public void run(){
        b.withdraw(amt);
        

    }
    public static void main(String[]args){
        System.out.println("Program for the Synchronization....");

        Test a=new Test();
        a.amt=9000;
        a.start();
        Test t=new Test();
        t.amt=1200;
        t.start();

        Test p=new Test();
        p.amt=3213;
        p.start();


        Test s=new Test();
        s.amt=900;
        s.start();
        

    }
 }