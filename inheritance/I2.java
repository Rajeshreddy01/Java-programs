package inheritance;

class O {
    String name;

    // Constructor with a parameter
    public O(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class P extends O {
    int age;

    // Subclass constructor
    public P(String name, int age) {
        super(name); // Calls the superclass constructor with one parameter
        this.age = age;
        System.out.println("Dog constructor called");
    }
}

public class I2 {
    public static void main(String[] args) {
        P dog = new P("Buddy", 5);
    }
}

