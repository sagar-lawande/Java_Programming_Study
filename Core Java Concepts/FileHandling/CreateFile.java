
import java.io.File;

public class CreateFile {
	public static void main(String[]args){
		System.out.println("Program for the Create New File");
		File f=new File("C:\\Users\\ASUS\\Desktop\\java1.txt");
		try{
		if(f.createNewFile()){
			System.out.println("File Successfully Created....");
		}else{
			System.out.println("File Alredy Exist....");
		}
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Program Executed Successfully...Exception Handled or abnormal termination avoided...");
		
	}

}
