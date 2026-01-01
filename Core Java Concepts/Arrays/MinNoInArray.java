import java.util.Scanner;
public class MinNoInArray
{
    public static void main(String[]args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Program for Find  the Min No In the Array");
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
        int min =array[0];
        for(int i=0;i<array.length;i++){

          if(array[i]<min){
            min=array[i];
          }
           

    }
     System.out.println("The Min No in The array is = "+min);

     System.out.println("Sum of All elements in The Array");
     int sum=0;
     for(int i=0;i<array.length;i++){
        sum=sum+array[i];
        
     }System.out.println("Sum = "+sum);
}
}
