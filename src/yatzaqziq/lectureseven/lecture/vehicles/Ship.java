package yatzaqziq.lectureseven.lecture.vehicles;

public class Ship extends Vehicle {
    int weight;
    int mileage;
    public Ship(String brand, String model, int weight, int mileage) {
        super(brand, model);
        this.weight = weight;
        this.mileage = mileage;
    }

    public void printShipData(){
        System.out.println("Ship Data: " + brand + " " + model + " " + weight + " " + mileage);
    }

}