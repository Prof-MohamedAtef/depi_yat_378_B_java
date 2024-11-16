package ictgharbia.lectureseven.lecture.vehicle;

import ictgharbia.lectureseven.lecture.vehicle.engine.ElectricEngine;
import ictgharbia.lectureseven.lecture.vehicle.engine.Engine;

// Child class
public class Ship extends Vehicle{
    int height;

    public Ship(int weight, String color, String brand, int height){
        this.setWeight(weight);
        this. setColor(color);
        this.setBrand(brand);
        this.height = height;

//        Engine engine = new Engine();
//        engine.

//        ElectricEngine electricEngine = new ElectricEngine();
//        electricEngine.

    }
}
