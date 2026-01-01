public class SwappingOfNo{

    SwappingOfNo(){
        System.out.println("PROGRAM FOR SWAPPING OF NO:");
    }


     int a;
     int b;
     int c;
    public void swap(int a,int b){
        System.out.println("\nSwapping Done by using third variable");
        
        System.out.println("Value of a = "+a);
        System.out.println("value of b = "+b);
        
        System.out.println("\nAFTER SWAPPING :");
         c=a;
         a=b;
         b=c;
         System.out.println("a = "+a);
         System.out.println("b = "+b);
    }
   public void swapping(int a,int b){
    System.out.println("\nSwapping Done without using third variable");

    System.out.println("Value of a = "+a);
    System.out.println("value of b = "+b);

    
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("\nAfter Swapping :");

    System.out.println("a = "+a);
    System.out.println("b = "+b);

   }
    public static void  main(String[]args){
        SwappingOfNo s=new SwappingOfNo();
        s.swap(10,20);
        System.out.println("-------------------------------------------------------------------");
        s.swapping(50,100);

        
    
    }



}




    
