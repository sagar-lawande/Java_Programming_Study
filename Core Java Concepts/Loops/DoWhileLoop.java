import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        do {
            System.out.print("Please enter your age: ");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is: " + age);
    }
}
