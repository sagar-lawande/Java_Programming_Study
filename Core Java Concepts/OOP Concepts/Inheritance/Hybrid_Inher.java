// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Interface 1
interface CanRun {
    void run();
}

// Interface 2
interface CanSwim {
    void swim();
}

// Child class Dog inherits Animal and implements CanRun
class Dog extends Animal implements CanRun {
    public void run() {
        System.out.println("Dog is running...");
    }
}

// Child class Cat inherits Animal and implements CanSwim
class Cat extends Animal implements CanSwim {
    public void swim() {
        System.out.println("Cat is swimming...");
    }
}

public class Hybrid_Inher {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal
        d.run();   // From CanRun

        Cat c = new Cat();
        c.eat();   // From Animal
        c.swim();  // From CanSwim
    }
}
