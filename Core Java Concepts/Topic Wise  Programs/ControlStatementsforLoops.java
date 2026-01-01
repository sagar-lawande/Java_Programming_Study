public class ControlStatementsforLoops{
    public static void main(String[]args){
        System.out.println("Program for the Control Statements of Loop\n1]Continue\n2]Break\n3]Return");
        Continue();
        Break();
        Return();
        
    }
   public static void Continue(){
    System.out.println("Program for the use of Continue statement");
    for(int i=0;i<=10;i++){
        if(i==5)
        {
        System.out.println("    Skip the No 5 and continue the program");
            continue;  
        }System.out.println(i);  
        }
    }


    public static void Break(){
        System.out.println("\nProgram for the Break Statement");
         for(int i=0;i<=10;i++){
        if(i==5)
        {
        System.out.println("    Break at the No 5 and stop the program");
            break;  
        }System.out.println(i);  
        }
    }

    
    public static void Return(){
        System.out.println("\nProgram for the Return statement");
        for(int i=0;i<=10;i++){
        if(i==5)
        {
        System.out.println("    Break at the No 5 and exist complete main  method no  remaining program or the method executed");
            return;  
        }System.out.println(i);  
        }System.out.println("'sdsdgsdgsdagadg");//not executed 
        
    }
   }
