package yatzaqziq.lectureseven.lecture.vehicles;

import yatzaqziq.lectureseven.lecture.books.Book;

public class Vehicle {
    String brand;
    String type;
    String model;
    String color;

    int distance;

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

    public void calculateDistance(int speed, int time){
        distance = speed * time;
        System.out.println("Vehicle Distance: " + distance);
    }


}