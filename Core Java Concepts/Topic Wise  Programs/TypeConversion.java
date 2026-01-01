public class TypeConversion{
    public static void main(String[]args){
        System.out.println("Program for the Type Conversion/Casting of Data types");
        System.out.println("\nImpicit Type Casting.....Automatic type casting");
        int a=50;//size= 4 bytes
        long b=a;//size= 8 bytes
        System.out.println("\nvariable a int is converted into long variable b = \n"+b);
        System.out.println("\nExplicit Type Casting...Manual Type Casting");
        System.out.println("\nvariable double x is converted into integer variable y ");
        double x=10.5;//size =8 bytes....... large value converted into small value
        int y=(int)x;//size=4 bytes
        System.out.println(y);
        float f=85.5f;
        int i=(int)f;
        System.out.println(i);


    }
}