public class Function{
    
    static int a=5;
    static int b=10;
    static int c=10;
     
    public static void main(String[]args){
        System.out.println("\nIn this Program understand That any static or non static method can access the Static variables");
        System.out.println("\nProgram for creating Different functions in One Class ");
        Function obj1=new Function();
        Function obj2=new Function();
        Function obj3 =new Function();
        obj1.incrementCount();  // Output: Count: 1
        obj2.incrementCount(); 
        obj3.incrementCount(); 
        obj1.Add();
        Sub();
    
    }
    void incrementCount() {   // Non-static method   method call 3 times eacch time it increases the initial value
        a++;  // accessing static variable
        System.out.println("Count: " + a);
    }
    void Add(){                                  // non static function or method required class object for access the static variables
        int d=b+c;                         
        System.out.println("Count: " + d);



    }
    static void Sub(){                   //static method  without creation or using the object
                                         //static variables are acessed
        int sub=b-c;
        System.out.println("Count: " + sub);  
    
    }
}



        
