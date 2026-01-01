import java.util.Scanner;
public class UserInput{
    public static void main(String[]args){
        System.out.println("Program for the Taking User Input");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No :");
        int a=sc.nextInt();
        System.out.println("The no = "+a);
        System.out.println("Enter the Name :");
        String name=sc.next();
        System.out.println("Name = "+name);

    }
}