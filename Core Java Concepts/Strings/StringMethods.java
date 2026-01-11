public class StringMethods{


    public void compareTo(){

        //compareTo can compare
        //1] s1 > s2  : +ve value
        //2] s1 == s2 : gives 0
        //3] s1 < s2 : gives -ve value

        String s1="Sagar";
        String s2="Sagar";
        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal");

        }else{
            System.out.println("Strings are not equal");
        } 

    }
    public void compareUingEqualTo(){
        String s = new String("Sagar");
        String p =new String("Sagar");
        if(s==p){
            System.out.println("String s1 and s2 are equal");
        }
        else{
             System.out.println("Strings are not equal");
        }
    }


    public static void main(String[]args){
        System.out.println("Program for the String Methods....");
        StringMethods obj=new StringMethods();
        obj.compareTo();
        obj.compareUingEqualTo();

        String name ="Sagar";
        String surname="Lawande";
        System.out.println(name.toLowerCase());//method for convert into lowerCase

        System.out.println(name.toUpperCase());//method==UpperCase

        System.out.println(name.length()); //method give total length

        System.out.println(name.charAt(3));//specific index charachter gives

        System.out.println(name.indexOf('a'));//specific charachter gives index

        System.out.println(name.indexOf("gar"));//it gives starting index

        System.out.println(name.substring(1,4));//print characters between that index

        System.out.println(name.concat(surname));//join 

        System.out.println(name.toCharArray());//divide string into characters

        String r="     sagar  Lawande   ...   ";
        System.out.println(r.trim());//removes 1st and last space

        String l="Java Programming";
        String[] ch=(l.split(" "));     //divide into separate names

        for(int i=0;i<l.length();i++){
            System.out.println(l.charAt(i));  //give each charachter separately..
        }

        System.out.println(ch);  //it print address not value 
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        
        






    }
}