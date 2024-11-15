package yatzaqziq.lectureseven.lecture.vehicles;

public class Car extends Vehicle {
    int licenseId;
    int wheels;

    public Car(){

    }

    public Car(String brand, String model, int wheels, String color, int licenseId){
        super(brand, model, color);
        this.wheels = wheels;
        this.licenseId = licenseId;
    }

    public void printCarData(){
        System.out.println("Car Data: " + brand  + " " +  model + " " + wheels + " " + color + " " + licenseId);
    }

    public void printVehicle() {
        super.printVehicle();

        // different implementation
    }

    public void calculateDistance(int speed, int time){
        distance = speed * time;
        System.out.println("Car Movement distance: " + distance);
    }
}
