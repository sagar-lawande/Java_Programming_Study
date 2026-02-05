public class UseOf_throws{

    void add(int a,int b)throws ArithmeticException//throws use to declare Exception
    {                       // that means the caller method have to handle it
    int c=a/b;
    System.out.println(c);
    }

    public static void main(String[]args){
        System.out.println("Program for the Use of throws keyword");
        UseOf_throws obj=new UseOf_throws();
        try{
        obj.add(100,0);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Exception handle by caller method and execution is continued..");


    }
}