import java.io.*;
public class FileInformation{
    public static void main(String[]args){
        System.out.println("Program for the Display file Information....");
        File f=new File("C:\\Users\\ASUS\\Desktop\\java.txt");
        try{
        if(f.exists()){
            System.out.println("File Name : "+f.getName());// file Name Gets
            System.out.println("File Location : "+f.getAbsolutePath());// File Location gets
            System.out.println("File Writable : "+f.canWrite());// Wecan write or Not in it gets
            System.out.println("File Readable :"+f.canRead());//WE can read it or not
            System.out.println("File Size :"+f.length()); // File size gets
            System.out.println("File Removed :"+f.delete());// file delete

            
        }else{
            System.out.println("File Not Exists....");
        }
    }catch(Exception e){
        System.out.println(e);
    }


    }
}