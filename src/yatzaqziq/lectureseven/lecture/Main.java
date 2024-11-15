package yatzaqziq.lectureseven.lecture;

import yatzaqziq.lectureseven.lecture.books.Book;
import yatzaqziq.lectureseven.lecture.books.Story;
import yatzaqziq.lectureseven.lecture.vehicles.Car;
import yatzaqziq.lectureseven.lecture.vehicles.Ship;
import yatzaqziq.lectureseven.lecture.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book();
//        book.

//        book.

//        Story story = new Story();
//        story.

        // car constructor
//        Vehicle vehicle = new Vehicle(4, "BMW", "CAR", "E-46", "Black");
//        vehicle.printVehicle();

//        Vehicle ship = new Vehicle()

        Car car = new Car("BMW", "E-46", 4, "Black", 50350);
        car.printCarData();

        Ship ship = new Ship("RRRR", "ASAS", 5000, 15000);
        ship.printShipData();


        Vehicle vehicle = new Vehicle();
        vehicle.calculateDistance(120, 1);

        car.calculateDistance(220,1);

        Vehicle car2 = new Car();
        car2.calculateDistance(250, 2);

        Story story = new Story();
        story.calculatePrice(500, 1);

        Book book = new Story();
        book.calculatePrice(350, 2);
        book = new Book();
        book.calculatePrice(250, 3, 0.2); /// compile time


    }
}
