import java.util.Scannr;
public class PrimeOrNot{
    Scanner sc=new Scanner
    PrimeOrNot(){
        System.out.println("Program for check the no is Prime or Not");

    }

    void check(){
        System.out.println("Enter the No :");
        int no=sc.nextInt();
        if(no<1)
            System.out.println("The  "+no+" is Not Prime");
        }
        else{
        for(int i=2;i<no;i++){
            if(no%i==0){
                System.out.println("The "+no+" is not Prime");
                break;
            }
            
        }
        }if(i==no){

        
            System.out.println("The "+no+" is Prime");
        }

    }
