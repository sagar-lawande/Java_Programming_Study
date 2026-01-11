import java.util.Scanner;
public class PrintAllPrimesTillN
{
    public static void main(String[]args)
    {
        System.out.println("Print all Prime No Till NO  ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No :");
        int no=sc.nextInt();
        isPrime=true;
        if(no<=1){
            System.out.println("The no is not prime");

        }else{
            for(int i=2;i<=no;i++){
                if(no%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(no +" ");
        }

    }
}