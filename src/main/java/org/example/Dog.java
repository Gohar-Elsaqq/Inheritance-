package org.example;

public class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}