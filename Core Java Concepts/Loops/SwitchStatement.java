import java.util.Scanner;
public class SwitchStatement{
    public static void main(String[]args){
        System.out.println("program for the use of Switch statement and Create CALCULATOR");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st No = ");
        int no1=sc.nextInt();
        System.out.println("Enter the 2nd No = ");
        int no2=sc.nextInt();
        System.out.println("Enter the No The Operation You want to Perform ");
        
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int no=sc.nextInt();
        switch(no)
        {
            case 1:
            int addition=no1+no2;
            System.out.println("Additon of "+no1+ " and "+no2+" is = "+addition);
            break;

            case 2:
            int sub=no1-no2;
            System.out.println("Subtraction of "+no1+ " and "+no2+" is = "+sub);
            break;

            case 3:
            int mul=no1*no2;
            System.out.println("Multiplication of "+no1+ " and "+no2+" is = "+mul);
            break;

            case 4:
            int division=no1/no2;
            System.out.println("Division of "+no1+ " and "+no2+" is = "+division);
            break;
        }

        


    }


}