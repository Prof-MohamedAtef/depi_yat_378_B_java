package yatzaqziq.lectureseven.lecture.vehicles;

public class Car extends Vehicle {
    int licenseId;
    public Car(String brand, String model, int wheels, String color, int licenseId){
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.color = color;
        this.licenseId = licenseId;
    }




    public void printCarData(){
        System.out.println("Car Data: " + brand  + " " +  model + " " + wheels + " " + color + " " + licenseId);
    }
}
