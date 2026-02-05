class Student implements Cloneable {

    int id;
    String name;

    // constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // override clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // display method
    void show() {
        System.out.println(id + " " + name);
    }
}

public class UsingObjClone {
    public static void main(String[] args) throws CloneNotSupportedException {

        // original object
        Student s1 = new Student(1, "Sagar");

        // cloned object
        Student s2 = (Student) s1.clone();

        System.out.println("Original Object:");
        s1.show();

        System.out.println("Cloned Object:");
        s2.show();
    }
}
