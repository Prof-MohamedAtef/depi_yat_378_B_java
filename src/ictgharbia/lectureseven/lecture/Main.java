package ictgharbia.lectureseven.lecture;

import ictgharbia.lectureseven.lecture.book.Story;
import ictgharbia.lectureseven.lecture.vehicle.Car;
import ictgharbia.lectureseven.lecture.vehicle.Ship;
import ictgharbia.lectureseven.lecture.vehicle.Vehicle;
import ictgharbia.lectureseven.lecture.vehicle.engine.ElectricEngine;
import ictgharbia.lectureseven.lecture.vehicle.engine.FuelEngine;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book(2024, "Dar Misr", "Taha Hussein","Al Ayam", "https://www.doi.com/a210210.html",65065, 1000);
//        book.printBook();

//        Story story = new Story(2024, "Dar Misr", "Taha Hussein","Al Ayam");
//        Story story = new Story(2024, "Database");
//        story.printStory();

//        Story story = new Story(2025,"Dar Misr", "Taha Hussein", "Al Ayam");
//        story.printAllStory();

//        Story story = new Story(98.9, 50, 25);
//        story.printPrice();

//        Vehicle mercedes = new Vehicle(500, "Red", "Mercedes");
//        Vehicle plane = new Vehicle(250, "White",  "Poing");

        Ship ship = new Ship(500, "Red", "TREWO", 25);

        Car car = new Car(500, "Black", "Mercedes", 2);

        Car carWithEngine = new Car(new FuelEngine(), "Mercedes", "Black", 2, "C300", 4);
        carWithEngine.print();

    }
}
