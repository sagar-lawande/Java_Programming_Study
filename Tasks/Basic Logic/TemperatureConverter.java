import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[]args){
        System.out.println("Program for Temperature Converter from CELSIUS TO FARENHITE");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius ");
        float temp=sc.nextFloat();
        System.out.println("Conversion of CELSIUS TO FARENTHITE");
        float fareTemp=(temp*9/5)+32;
        System.out.println("Converted Temperature = "+fareTemp);
        

    }
}