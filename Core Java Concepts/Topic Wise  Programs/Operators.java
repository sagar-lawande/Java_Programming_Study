public class Operators{
    public static void main(String[]args){
        System.out.println("program for the Operators");

        System.out.println("\nARITHMETIC OPERATOR");
        int a=12;
        int b=2;
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        System.out.println("Addition = "+add);
        System.out.println("Subraction ="+sub);
        System.out.println("Multiplication ="+mul);
        System.out.println("Division ="+div);
        System.out.println("\n Assignment Operator");
         a+=10;
         b-=10;
         mul*=5;
         div*=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(mul);
        System.out.println(div);
        System.out.println("\nUnary Operator / Shorthand Operators");
        System.out.println("Actual Value of a = "+a);
    
        a++;//post increment
        ++a;//Pre increment
        System.out.println("Value of a after Post increment = "+a);
        System.out.println("Value of a afte Pre increment = "+a);

        a--;//Post Decrement
        --a;//Pre Decrement
       System.out.println("\nValue of a after post Decrement = "+a);
        System.out.println("Value of a afte Pre Decrement = "+a);

      System.out.println("\nComparison operator");
      /*
      a>=b;//greater than equal
      a<=b;//smaller than equal to
      a==b;//equal to
      a!=b //not equal to
      a!==b//not equal to  and type
      ===  // equal to and type 
      */

      System.out.println("\nLogical Operator");
      /*&&.....Logical and
        ||.....Logival Or  
        ! Logical Not 
        */
      System.out.println("\nBitwise Operator");
      /* &  And
         |   Or
         ~  Not
         ^  XOR
         <<  leftshift
         >>  Rightshift
      */   
        
        
    }
}