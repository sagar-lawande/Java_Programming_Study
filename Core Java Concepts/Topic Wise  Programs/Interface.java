public class Interface{
    public static void main(String[]args){
        System.out.println("Program for the Use OF INTERFACE");     

        Car car = new Car();
        car.start();     // Car started
        car.honk();      // Beep Beep! (from interface default method)
        Vehicle.info();
        

    }
}
interface Vehicle {
    int MAX_SPEED = 120;  // public static final by default

    void start();          // abstract method
    void stop();           // abstract method

    default void honk() {  // default method
        System.out.println("Beep Beep!");
    }

    static void info() {   // static method
        System.out.println("Vehicles are important!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}


