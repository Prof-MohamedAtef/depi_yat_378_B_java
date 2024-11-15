package yatzaqziq.lectureseven.lecture.vehicles;

public class Vehicle {
    int wheels;
    String brand;
    String type;
    String model;
    String color;

    public Vehicle(){

    }

    public Vehicle(int wheels, String brand, String type, String model, String color) {
        this.wheels = wheels;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public Vehicle(String brand, String type, String model, String color) {
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void printVehicle(){
        System.out.println("Vehicle Data: " + this.brand + " " + this.type + " " + this.model + " " + this.color);
    }
}