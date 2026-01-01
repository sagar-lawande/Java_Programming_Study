import java.util.Arrays;
import java.util.Collections;

class ArraySort {
    public static void main(String[] args) {
        Integer arr[] = {50, 10, 40, 20, 30};

        System.out.println("Array in Ascending Order:");

        Arrays.sort(arr);                                   //Ascending order
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray in Descending Order:");

        Arrays.sort(arr, Collections.reverseOrder());         //descending order 
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
