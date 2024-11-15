package yatzaqziq.lectureseven.test;

public class MainTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "Toyota", "Corolla");
        vehicle.printVehicle();

        Vehicle car = new Car(4, "Hunda", "CIVIC");
        car.printVehicle();

//        ((Car) car).setDesign("Sporty");
//        car.printVehicle();

        Lion lion = new Lion(4, "meat");
        lion.eat();

    }
}
