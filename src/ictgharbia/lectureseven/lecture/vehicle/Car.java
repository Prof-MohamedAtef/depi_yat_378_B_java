package ictgharbia.lectureseven.lecture.vehicle;

import ictgharbia.lectureseven.lecture.vehicle.engine.ElectricEngine;
import ictgharbia.lectureseven.lecture.vehicle.engine.Engine;
import ictgharbia.lectureseven.lecture.vehicle.engine.FuelEngine;

//child class
public class Car extends Vehicle {
    int wheels;
    Engine engine;

    public Car(int weight, String color, String brand, int wheels) {
        this.wheels = wheels;
        this.setWeight(weight);
        this.setColor(color);
        this.setBrand(brand);
    }


    public Car(Engine engineType, String brand, String color, int weight, String model, int wheels) {
        this.setBrand(brand);
        this.engine = engineType;
        this.setColor(color);
        this.setWeight(weight);
        this.setModel(model);
        this.wheels = wheels;
    }


    public void print() {  // method overriding

        if (engine instanceof Engine) {
            if (engine instanceof ElectricEngine) {
                this.type = "Electric Engine";
            } else if (engine instanceof FuelEngine) {
                this.type = "Fuel Engine";
            }
        }

        System.out.println(
                "Vehicle data Weight:" + this.getWeight() + " " + getColor() + " " + getBrand() + " " + getModel() + " " + wheels + " Engine : " + this.type
        );
    }
}
