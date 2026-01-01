import java.util.Scanner;
public class ConditionalStatements{
    public static void main(String[]args){
        System.out.println("Program for  use of Conditional Statements");
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the  Age of the Person");
        int age=sc.nextInt();
        Conditions(age);          //local variable pass to the static method as argument or passing
    }

    static void Conditions(int age)    // parameter used for this method
    {
        if (age>12 && age<20)
        {
            System.out.println("The person is the Teen Ager");
        }
        else if(age>21 && age<50){
            System.out.println("The person is the mid Age");
        }
        else if(age>1 && age<12){
            System.out.println("The person is the small child Age");
        }
        else{
            System.out.println("The person is the old man Age");
        }
    }

        

        

    }
