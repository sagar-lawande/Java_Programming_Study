public class ExceptionHandles{
    public static void main(String[]args)throws ClassNotFoundException{
        System.out.println("Program for Exception Handling");
        try{

        
        Class.forName("com.mysql.cj.jdbc.Driver");//this can give compile time exception 
        //ClassNotFoundException
        }catch(Exception e){

 System.out.println("Driver Loaded");
        }
       

        
    }
}