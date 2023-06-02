package org.example.assignment3;

class Animal {
    public void hello() {
        System.out.println("Hello Animal");
    }
}

class Dog extends Animal {
    @Override
    public void hello() {
        System.out.println("Hello Dog");
    }
}

class Cat extends Animal {
    @Override
    public void hello() {
        System.out.println("Hello Cat");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.hello();
        animal2.hello();
    }
}
