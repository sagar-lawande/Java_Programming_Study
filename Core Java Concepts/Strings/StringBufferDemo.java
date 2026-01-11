

public class StringBufferDemo {

    public static void main(String[] args) {

        // Printing program title
        System.out.println("Program for StringBuffer");

        // Creating a StringBuffer object with initial value
        // StringBuffer is mutable and thread-safe
        StringBuffer sb = new StringBuffer("Hello");

        // append() adds text at the end of the existing string
        sb.append(" Sagar");

        // insert() adds text at a specific index
        sb.insert(5, ",");

        // Printing the modified StringBuffer
        System.out.println("After append and insert: " + sb);

        // delete() removes characters from start index to end index (exclusive)
        sb.delete(5, 6);   // removes ','

        System.out.println("After delete: " + sb);

        // reverse() reverses the entire string
        sb.reverse();

        System.out.println("After reverse: " + sb);

        // length() returns the number of characters
        System.out.println("Length of StringBuffer: " + sb.length());

        // capacity() shows the current buffer capacity
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }
}
