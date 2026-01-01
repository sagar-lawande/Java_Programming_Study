import java.util.Scanner;
public class MaxNoInArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Program for find the max no in an Array");

       System.out.println("Enter the size of the Array");
       int size =sc.nextInt();
       int[]array=new int[size];

    System.out.println("Enter the Array Elements");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();

    }
    System.out.println("Your Array is ");
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
    }

    
    int max=array[0];
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];

        }
        
    }System.out.println("The Max No in Array is = "+max);
}
}