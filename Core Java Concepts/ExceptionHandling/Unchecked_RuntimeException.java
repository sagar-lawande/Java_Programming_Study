public class Unchecked_RuntimeException{
    public static void main(String[]args)throws Exception{
        System.out.println("Program for Unchecked Exception/Runtime Exception");
        try{
        int a=100;
        int b=0;
        
        int c=a/b;   
        System.out.println(c);                 //ArithmeticException occur at Runtime
        }catch(ArithmeticException e){

            System.out.println(e);  // e contain object of ArithmeticException Class
            System.out.println("Are bhai zero se kabhi divide nhi hota answer infinite ata hai");

        }            
        
    }
}