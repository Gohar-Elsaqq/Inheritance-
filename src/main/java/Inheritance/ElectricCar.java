package Inheritance;

public class ElectricCar extends Car {
    private int batteryLife;

    public ElectricCar(String brand, String model, int batteryLife) {
        super(brand, model);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void honk() {
        System.out.println("Electric car beep beep!");
    }
}
