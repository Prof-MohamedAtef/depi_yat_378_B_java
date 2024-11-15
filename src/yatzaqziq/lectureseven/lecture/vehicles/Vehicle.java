package yatzaqziq.lectureseven.lecture.vehicles;

public class Vehicle {
    String brand;
    String type;
    String model;
    String color;

    public Vehicle(){

    }

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void printVehicle(){
        System.out.println("Vehicle Data: " + this.brand + " " + this.model + " " + this.color);
    }
}