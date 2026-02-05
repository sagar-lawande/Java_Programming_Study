public class UsingNewKeyword{

    public void method1(){
        System.out.println("You are in the method 1");


    }
    public static void main(String[]args){
        System.out.println("Program for the Object Creation");
        UsingNewKeyword obj =new UsingNewKeyword();
        obj.method1();
    }
}