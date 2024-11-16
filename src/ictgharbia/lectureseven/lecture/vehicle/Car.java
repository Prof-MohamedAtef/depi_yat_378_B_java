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
        this.weight = weight;
        this.color = color;
        this.brand = brand;
    }


    public Car(Engine engineType, String brand, String color, int weight, String model, int wheels) {
        this.brand = brand;
        this.engine = engineType;
        this.color = color;
        this.weight = weight;
        this.model = model;
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
                "Vehicle data Weight:" + weight + " " + color + " " + brand + " " + model + " " + wheels + " Engine : " + this.type
        );
    }
}
