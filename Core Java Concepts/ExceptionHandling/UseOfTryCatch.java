public class UseOfTryCatch{

    public void tryCatchUse(){
        try{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
        System.out.println("Bhai Infinite ayega 0 se divide nhi hota");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[]args){
        System.out.println("Program for the Use Of Try Catch...");
        UseOfTryCatch obj=new UseOfTryCatch();
        
        obj.tryCatchUse();                             // we can use try-catch block here also
        
        
          System.out.println("Program executed continously");

    }
}