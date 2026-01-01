// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class Single_Inher {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}
