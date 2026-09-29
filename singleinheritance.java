class Animal {
    String name = "Dog";

    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println("Name: " + d.name);
        d.eat();
        d.bark();
    }
}
