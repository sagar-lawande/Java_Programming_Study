class ThisKeyword {

    //  Instance variables (object variables)
    int id;
    String name;
    int marks;

    //  Constructor with parameters
    //  this.id, this.name, this.marks
    // current object ke instance variables ko refer kar raha hai
    ThisKeyword(int id, String name, int marks) {
        this.id = id;        // differentiate instance variable from local variable
        this.name = name;
        this.marks = marks;
    }

    //  Method to display data
    void display() {
        // this keyword optional hai, but clarity ke liye use kiya
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }

    //  Method calling another method using this
    void show() {
        this.display();   // calling current class method
    }

    //  Returning current object using this
    ThisKeyword getObject() {
        return this;
    }

    // Constructor chaining using this()
    ThisKeyword() {
        this(101, "Sagar", 85);  // calls parameterized constructor
        System.out.println("Default constructor executed");
    }

    // Main method
    public static void main(String[] args) {

        // Object creation using default constructor
        ThisKeyword s1 = new ThisKeyword();

        System.out.println("----- Using show() method -----");
        s1.show();

        System.out.println("----- Using returned object -----");
        ThisKeyword s2 = s1.getObject();
        s2.display();
    }
}
