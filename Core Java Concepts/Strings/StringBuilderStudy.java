public class StringBuilderStudy{
    public static void main(String[]args){
        System.out.println("Program for the String Builder");

        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Sagar");            // add new string
        System.out.println(sb);


         sb.insert(0,'V');
         System.out.println(sb);

         sb.delete(0,3);
         System.out.println(sb);

         sb.reverse();
         System.out.println(sb);
         System.out.println(sb.length());
    }
}