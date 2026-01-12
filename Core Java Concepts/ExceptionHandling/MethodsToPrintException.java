public class MethodsToPrintException{
    public static void main(String[]args){
        System.out.println("Program for Methods to Print Exception");
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println(e);       // default message is print
            e.printStackTrace();  
            System.out.println(e.toString());
            System.out.println(e.getMessage());

            System.out.println("All the methods are used to print Exception");


        }
    }
}