import java.util.Scanner;
public class ExceptionHandles{
    public static void main(String[]args){
        System.out.println("Program for Exception Handling");
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter Numerator ");
            int numerator=sc.nextInt();
            System.out.println("Enter Denominator");
            int denominator=sc.nextInt();
             int result=numerator/denominator;
             System.out.println(result);


        }catch(ArithmeticException e){
            System.out.println("error:0 can not be divide");
        }
        finally{
            System.out.println("Exception handle or not this block Executed");

        }
        System.out.println("The Program Executes Continously...");

        }
    }
