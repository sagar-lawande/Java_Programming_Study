import java.io.*;
public class FileRead{


    public static void main(String[]args){
        System.out.println("Program  for Read File Data...");
        try
        {
            FileReader r=new FileReader("C:\\Users\\ASUS\\Desktop\\Java.txt");
            try
            {
                int i;
                while((i=r.read())!=-1)
                {
                    System.out.print((char)i);

                }

            }
            finally
            {
            r.close();
            }
             
            
        }catch(Exception e){
            System.out.println(e);
}
    }
}