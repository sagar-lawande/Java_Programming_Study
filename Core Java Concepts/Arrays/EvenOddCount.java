import java.util.Scanner;
public class EvenOddCount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program  for The  Even or Odd No Count In The  Array ");
        
        System.out.println("Enter the size of the  Array");
        int size =sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
         }
         int even=0;
         int odd =0;
System.out.println("Your array is ");
for(int i=0;i<array.length;i++){
    System.out.println(array[i]);
    
         if(array[i]%2==0){
            even++;
         }else{
            odd++;
         }
            

         }
         
          System.out.println("even no are "+even);
            System.out.println("odd no are "+odd);
    }
}