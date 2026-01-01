import java.util.Scanner;
public class AverageOfElem{

    public static void main(String[]args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Program for calculate the Average of the Array Elements");
        System.out.println("Enter the Size Of the Array");
        int size=sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Your Array is = ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        

     System.out.println("Sum of All elements in The Array");
     int sum=0;
     for(int i=0;i<array.length;i++){
        sum=sum+array[i];
        
     }System.out.println("Sum = "+sum);

     System.out.println("Average of the Array Elements ");
     int average=sum/2;
     System.out.println("Average = "+average);
}
}
