package ictgharbia.lecturefive;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {

    String firstName;

    public static void main(String[] args) {
//        Animal animal = new Animal();
//
//        Animal animal1 = new Animal(0, "lion", "yellow", 250);
//
//        Animal animal2 = new Animal("Cat", 4, 60, "Cat");
//        Animal animal3 = new Animal(4, "Horse", "brown", 400);
//
//        Animal animal4 = new Animal("Giraph", 4);
//
//        animal3.printLegs("Mohamed", "Atef");
//
//        animal4.printLegs();

//
//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Enter width");
//        int width = reader.nextInt();
//        System.out.println("Enter Height");
//        int height = reader.nextInt();
//
//        Animal animal2 = new Animal(width, height);


        Vehicle vehicle = new Vehicle();
        vehicle.run();

        vehicle.countDistance(20);


        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(3, 10);

        // method overloading
        Accountant accountant = new Accountant();
        accountant.countSales(150, 500, 600, 800, 1500);

        accountant.countTax();

        System.out.println("\n---Day Sales-----\n");
        accountant.countSales(300);
        accountant.countTax();

        System.out.println("\n---Month Sales-----\n");

        int[] monthSales = {3500, 5000, 9000, 15000};
        accountant.countSales(monthSales);

        accountant.countTax();



    }
}