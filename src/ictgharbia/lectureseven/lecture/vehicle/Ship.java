package ictgharbia.lectureseven.lecture.vehicle;

// Child class
public class Ship extends Vehicle{
    int height;

    public Ship(int weight, String color, String brand, int height){
        this.setWeight(weight);
        this. setColor(color);
        this.setBrand(brand);
        this.height = height;
    }
}
