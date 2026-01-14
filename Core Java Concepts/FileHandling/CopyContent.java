import java.io.*;
public class CopyContent{
    public static void main(String[]args)throws Exception{
        System.out.println("Copy Content from one File to Another...");
        FileInputStream read =new FileInputStream("C:\\Users\\ASUS\\Desktop\\Sagar.txt");
        FileOutputStream write =new FileOutputStream("C:\\Users\\ASUS\\Desktop\\java.txt");
        try{
        int i;
        while((i=read.read())!=-1){
            write.write((char)i);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Data Copy Successfully.....");
    }
}