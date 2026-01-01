public class Variables{
    int instancevar =100;//This is the instance variable
    static int staticvar=50;
    public static void main(String[]args){
        System.out.println("Program for Detail Variables and it Types ");
        System.out.println("\nTheir are 3 Type of variables in the Java Programming Language\nLocal Variable\nInstatnce Variable or Non Static Variable\nStatic Variable");
        int a=10;//This is the Local Variable
        final int constant=500;//constant variable  value not changed
        System.out.println("\nValue of Local Variable = "+a);
        Variables obj=new Variables();
        System.out.println("\nValue of Instance Variable ="+obj.instancevar);
        System.out.println("\nvalue of Static variable = "+Variables.staticvar);
        System.out.println("\nvalue of constant variable = "+constant);


    }
}