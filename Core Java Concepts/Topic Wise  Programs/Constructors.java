class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called!");
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); // calls default constructor
        s1.display();

        Student s2 = new Student("Sagar", 22); // calls parameterized constructor
        s2.display();
    }
}
