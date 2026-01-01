// Abstract class (cannot be instantiated directly)
abstract class Animal {
    
    // Abstract method (only declared, no body/implementation here)
    abstract void sound();

    // Normal method (can have body inside abstract class)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class 1 (Dog) that provides implementation of sound()
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2 (Cat) that provides implementation of sound()
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        
        // Animal a = new Animal()not allowed cannot create the object of the abstract class.

        // Create Dog object
        Animal dog = new Dog();   // Reference of parent, object of child
        dog.sound();              // Calls Dog's implementation
        dog.sleep();              // Calls normal method from Animal class

        // Create Cat object
        Animal cat = new Cat();   // Reference of parent, object of child
        cat.sound();              // Calls Cat's implementation
        cat.sleep();              // Calls normal method from Animal class
    }
}
