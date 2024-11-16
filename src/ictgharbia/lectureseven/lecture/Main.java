package ictgharbia.lectureseven.lecture;

import ictgharbia.lectureseven.lecture.book.Story;
import ictgharbia.lectureseven.lecture.vehicle.Car;
import ictgharbia.lectureseven.lecture.vehicle.Ship;
import ictgharbia.lectureseven.lecture.vehicle.engine.ElectricEngine;
import ictgharbia.lectureseven.lecture.vehicle.engine.Engine;
import ictgharbia.lectureseven.lecture.vehicle.engine.FuelEngine;

import java.util.ArrayList;

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

//        Ship ship = new Ship(500, "Red", "TREWO", 25);
//
//        Car car = new Car(500, "Black", "Mercedes", 2);
//
//        Car carWithEngine = new Car(new FuelEngine(), "Mercedes", "Black", 2, "C300", 4);
//        carWithEngine.print();

//        Vehicle vehicle = new Vehicle();
//        vehicle

        ArrayList<String> names = new ArrayList<>();
        names.add("Mohamed");
        names.add("Ahmed");
        names.add("Mostafa");

        for (String name: names){
            System.out.println(name);
        }

        names.add("-----------");
        names.add("Kareem");

        for (String name: names){
            System.out.println(name);
        }

        names.remove(2);

        for (String name: names){
            System.out.println(name);
        }

        names.add(2, "Nada");

        for (String name: names){
            System.out.println(name);
        }


        names.size();

        System.out.println(names.size());

        boolean isContaining = names.contains("Reem");
        System.out.println(isContaining);

        int index = names.indexOf("Nada");
        System.out.println(index);

        names.addFirst("Ramy");
        names.addLast("Ismael");

        for (String name: names){
            System.out.println(name);
        }

        String last =  names.getLast();
        System.out.println("Last Item in ArrayList: " + last);

        String first = names.getFirst();
        System.out.println("First Item: " + first);


        ArrayList<Engine> enginesList = new ArrayList<>();
        enginesList.add(new ElectricEngine());
        enginesList.add(new FuelEngine());

        for (Engine engine : enginesList){
            if (engine instanceof ElectricEngine){
                System.out.println("Electric Engine");
            }else if (engine instanceof FuelEngine){
                System.out.println("Fuel Engine");
            }
        }
    }
}
