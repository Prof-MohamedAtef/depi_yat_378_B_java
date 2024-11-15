package yatzaqziq.lectureseven.test;

public class Vehicle {
    protected int wheels;
    String brand;
    String model;
    public String color;

    public Vehicle() {
    }

    public Vehicle(int wheels, String brand, String model) {
        this.wheels = wheels;
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printVehicle(){
        System.out.println(brand + " " + model + " " + wheels);
    }
}
