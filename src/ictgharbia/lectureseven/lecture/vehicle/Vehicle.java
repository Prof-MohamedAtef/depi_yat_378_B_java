package ictgharbia.lectureseven.lecture.vehicle;

// Base class
// Parent class
// Super class
public class Vehicle {
    int weight;
    String color;
    String brand;
    String model;
    String type;


    Vehicle() {

    }

    public Vehicle(int weight, String color, String brand) {
        this.weight = weight;
        this.color = color;
        this.brand = brand;
    }


    public void print() {
        System.out.println(
                "Vehicle data Weight:" + weight + " " + color + " " + brand + " " + model
        );
    }
}