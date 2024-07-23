package Inheritance;

public class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void honk() {
        System.out.println("Car beep beep!");
    }
}