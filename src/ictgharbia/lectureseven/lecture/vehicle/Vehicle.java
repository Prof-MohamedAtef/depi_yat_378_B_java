package ictgharbia.lectureseven.lecture.vehicle;

// Base class
// Parent class
// Super class
public class Vehicle {
    // access modifier  private - public - protected - default
    private int weight;
    private String color;
    private String brand;
    private String model;
    String type;

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public Vehicle() {

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