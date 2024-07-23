package org.example;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");

        System.out.println(genericAnimal.getName());
        genericAnimal.makeSound(); // Output: Some generic animal sound

        System.out.println(dog.getName());
        dog.makeSound(); // Output: Woof
    }
}