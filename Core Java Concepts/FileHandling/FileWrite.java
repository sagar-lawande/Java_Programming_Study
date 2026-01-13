import java.io.*;
public class FileWrite{

    public void fileCreate(){
        File f =new File("C:\\Users\\ASUS\\Desktop\\Java.txt");
        try{
		if(f.createNewFile()){
			System.out.println("File Successfully Created....");
		}else{
			System.out.println("File Alredy Exist....");
		}
		}catch(Exception e){
			System.out.println(e);
		}
    }

    public void WriteFile(){
        System.out.println("Method For Write into file....");
        try{
        FileWriter f =new FileWriter("C:\\Users\\ASUS\\Desktop\\Java.txt");
        try{
		f.write("Java Programming is the Most Powerful Language...");
			System.out.println();
		}
		finally{
            f.close();
        }
		}catch(Exception e){
			System.out.println(e);
		}
        System.out.println("Write Successfully in file...");
    }

    
    public static void main(String[]args){
        System.out.println("Program for Write into File using Code...");
        FileWrite obj=new FileWrite();
        obj.fileCreate();
        obj.WriteFile();


        





    }
}