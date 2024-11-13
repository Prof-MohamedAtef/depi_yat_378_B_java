package ictgharbia.lecturesix;

public class Vehicle {
    private int wheels;
    private String brand;

    public Vehicle(){}

    public Vehicle(int wheels, String brand){
        this.wheels = wheels;
        this.brand = brand;
    }

    public Vehicle(int wheels){
        this.wheels = wheels;
    }

    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setWheels(int wheels, String brand){
        this.wheels = wheels;
        this.brand = brand;
    }

    public String printVehicle(){
        String vehicle = "Brand: " + this.brand + "\nWheels: " + this.wheels;
        return vehicle;
    }
}
