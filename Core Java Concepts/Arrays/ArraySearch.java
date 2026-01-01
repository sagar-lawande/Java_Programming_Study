import java.util.Scanner;
public class ArraySearch
{
    public static void main(String[]args){
        System.out.println("Program for Search the No  in  the Array");
         Scanner sc=new Scanner(System.in);
         boolean isfound=false;             // boolean flag to track if no is found

        
        int[]array={1,3,5,6,7,8,9};
        System.out.println("Enter the No You want to search ");
        int no=sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(no==array[i]){
                isfound=true;
                break;
            }
    
        }if(isfound){
            System.out.println("No " +no+ " is found in the Array ");

        }else{
            System.out.println("No " +no+ " is Not Found in the Array ");
        }

    }
}