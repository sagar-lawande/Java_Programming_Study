import java.io.*;
public class FileRename{
    public static void main(String[]args){
        System.out.println("Program for File Rename...");
        File f= new File("C:\\Users\\ASUS\\Desktop\\Java.txt");
        File r= new File("C:\\Users\\ASUS\\Desktop\\Sagar.txt");
        if(f.exists ()){
            System.out.println(f.renameTo(r));
            System.out.println("Renamed Successfully...............");

        }else{
            System.out.println("File Not exists.....");
        }
        
        
            }
        }
    
