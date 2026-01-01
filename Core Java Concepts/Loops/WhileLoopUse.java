import java.util.Scanner;
public class WhileLoopUse{
    public static void main(String[]args){
        System.out.println("Program for the Use of While Loop");
        Scanner sc=new Scanner(System.in);
        int age;
        do{
            System.out.println("Enter the valid age ");
            age=sc.nextInt();
        }while(age<0 || age>100);
        System.out.println("Your age is = "+age);

    }
}