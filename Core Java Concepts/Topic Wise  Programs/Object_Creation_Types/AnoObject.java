public class AnoObject{

    AnoObject(){
        System.out.println("Program for the anonymous Object");
        System.out.println("This is  the constructor called after object created");
    }

    public void anonymous(){
        System.out.println("you are in method 1");
    
    }


    public static void main(String[]args){
        new AnoObject().anonymous();       //anonymous object used only once, when object has 
        //single life cycle then use anonymous object 
        
    }
}