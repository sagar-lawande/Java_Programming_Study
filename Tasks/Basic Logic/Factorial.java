import java.util.Scanner;
public class Factorial
{
    Scanner sc=new Scanner(System.in);
    Factorial()
    {
        System.out.println("Program for Calculate Factorial");

    }

void calculate()
{
    int factorial=1;
    System.out.println("Enter the No : Factorial you want to calculate :");
    int no=sc.nextInt();
    for(int i=1;i<=no;i++){
         factorial=factorial*i;
       
        
    }  System.out.println("Factorial =  "+factorial);
}
public static void main(String[]args){
    Factorial f=new Factorial();
    f.calculate();
        

}
}
