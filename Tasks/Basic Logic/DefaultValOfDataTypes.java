public class DefaultValOfDataTypes
{
     byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    boolean bn;


         public static void main(String[]args)
    {
        System.out.println("Program for the print Default Values of PRIMITIVE DATA TYPES ");
        
    
        System.out.println("Default values of All Primitive Data Types ");
        DefaultValOfDataTypes obj=new DefaultValOfDataTypes();
        System.out.println("value of byte = "+obj.b);
        System.out.println("value of short = "+obj.s);
        System.out.println("value of int = "+obj.i);
        System.out.println("value of long= "+obj.l);
        System.out.println("value of float = "+obj.f);
        System.out.println("value of double= "+obj.d);
        System.out.println("value of char = "+obj.ch);
        System.out.println("value of boolean = "+obj.bn);
    }

   
}