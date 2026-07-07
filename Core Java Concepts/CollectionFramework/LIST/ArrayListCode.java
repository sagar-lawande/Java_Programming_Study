import java.util.ArrayList;
public class ArrayListCode{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        
        System.out.println("ArrayList: " + list);
        
        // Accessing elements
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);
        
        // Removing an element
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        //add elements in the list
        list.add("Date");
        list.add("Elderberry"); 
        list.add("Fig");
        list.add("Grape");
        
        
        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String item : list) {
            System.out.println(item);

        }

        //Check List is empty or not
        System.out.println("Is the list empty? " + list.isEmpty());

        //check the size of the list
        System.out.println("Size of the list: " + list.size());


    }
}