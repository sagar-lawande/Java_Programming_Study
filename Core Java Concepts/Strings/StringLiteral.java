public class StringLiteral
{
    public static void main(String[]args){
        System.out.println("Program for the String.....");//string == class , immutable
         
         String s = new String("JAVA");
         /*In this if we create object using new keyword 2 objects are created
            that means "JAVA" is placed into heap memory and s point it from stack..
            and 1 copy is send into SCP also.. */
            System.out.println(s);
            //this s print from the heap memory ...
            System.out.println(s.intern());
            //this intern method print from SCP memory

            String l="String Literal";  //without using new keyword object created called string literal
            System.out.println(l);     // object is placed in SCP memory.
    }
}