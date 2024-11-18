package yatzaqziq.lectureeight.test;

public class Car extends Vehicle {
    Car(String name) {
        super(name);
        Vehicle vehicle = new Vehicle(name) {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        vehicle.name = "Car";
        vehicle.move();

    }
}
