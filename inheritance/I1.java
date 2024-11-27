package inheritance;
class U {
    String name = "Animal";

    void display() {
        System.out.println("This is an Animal");
    }
}

class I extends U {
    String name = "Dog";

    void display() {
        super.display(); // Calls the superclass's display method
        System.out.println("This is an " + super.name); // Accesses the superclass's name field
    }
}

public class I1 {
    public static void main(String[] args) {
        I i = new I();
        i.display();
    }
}

