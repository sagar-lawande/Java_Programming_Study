import java.util.Scanner;
public class ArrayUserIp{
    public static void main(String[]args){
        System.out.println("Program for taken the input array from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("\nYour Array is");
        for(int  i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}