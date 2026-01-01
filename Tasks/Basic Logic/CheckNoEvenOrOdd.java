import java.util.Scanner;
public class CheckNoEvenOrOdd{
    Scanner sc=new Scanner(System.in);


    CheckNoEvenOrOdd(){
        System.out.println("Program for check the No is Even or Odd");

    }

void check(){
    System.out.println("Enter the No : ");
    int no=sc.nextInt();
    if(no%2==0){
        System.out.println("The No "+no+" is Even");
    }
    else{
        System.out.println("The No "+no +" is  Odd");
    }
}
    public static void main(String[]args){
        CheckNoEvenOrOdd obj=new CheckNoEvenOrOdd();
        obj.check();
    
    }
}