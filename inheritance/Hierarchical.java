package inheritance;

//Superclass
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }

 void sleep() {
     System.out.println("Animal is sleeping");
 }
}

//Subclass 1
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Subclass 2
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing");
 }
}

public class Hierarchical {
 public static void main(String[] args) {
     // Creating an instance of Dog
     Dog dog = new Dog();
     dog.eat();      // Inherited from Animal
     dog.sleep();    // Inherited from Animal
     dog.bark();     // Defined in Dog

     System.out.println();

     // Creating an instance of Cat
     Cat cat = new Cat();
     cat.eat();      // Inherited from Animal
     cat.sleep();    // Inherited from Animal
     cat.meow();     // Defined in Cat
 }
}

