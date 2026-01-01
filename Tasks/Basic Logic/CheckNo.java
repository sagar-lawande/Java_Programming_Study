import java.util.Scanner;
public class CheckNo{
    Scanner sc=new Scanner(System.in);

    CheckNo(){
        System.out.println("Check No is Positive , Negative or Zero");

    }
    void check(){
        System.out.println("Enter the No :");
        int no =sc.nextInt();
        if(no>0){
            System.out.println("The no is Positive");

        }else if(no<0){
            System.out.println("The no is Negative");

        }else{
            System.out.println("The No  is zero");
        }
        
    }
    public static void main(String[]args){
        CheckNo obj=new CheckNo();
        obj.check();

    }
}