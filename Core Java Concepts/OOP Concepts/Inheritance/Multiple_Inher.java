/*👉 Java does not allow multiple inheritance with classes, but we can achieve it using interfaces.  */
// First interface
interface CanRun {
    void run();
}

// Second interface
interface CanSwim {
    void swim();
}

// Class implementing both interfaces
class Athlete implements CanRun, CanSwim {
    public void run() {
        System.out.println("Athlete is running...");
    }

    public void swim() {
        System.out.println("Athlete is swimming...");
    }
}

public class Multiple_Inher {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        a.run();
        a.swim();
    }
}
