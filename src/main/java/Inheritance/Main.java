package Inheritance;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 500);

        System.out.println("Brand: " + tesla.brand);
        System.out.println("Model: " + tesla.getModel());
        System.out.println("Battery Life: " + tesla.getBatteryLife() + " miles");
        tesla.honk(); // Output: Electric car beep beep!
    }
}
