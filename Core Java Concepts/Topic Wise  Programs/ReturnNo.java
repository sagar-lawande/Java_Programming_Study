import java.util.Scanner;
public class ReturnNo{
   public static void main(String[]args){
      System.out.println("Program for the Return No");
      Add();
      int x=50;
      int z=x+Add();
      System.out.println(z);
      


   }
   static int Add(){
      int a=5;int b=10;
      int c=a+b;
      return c;
      
   }
}
