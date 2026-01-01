/* Run time poly means METHOD OVERRIDING*/
// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {   // method overriding
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {   // method overriding
        System.out.println("Cat meows");
    }
}

public class RuntimePolymor {
    public static void main(String[] args) {
        // Parent reference, but child objects
        Animal a;

        a = new Dog();   // Animal reference -> Dog object
        a.sound();       // Output: Dog barks

        a = new Cat();   // Animal reference -> Cat object
        a.sound();       // Output: Cat meows
    }
}
