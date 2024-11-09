package ictgharbia.lecturefive;

import java.util.Scanner;

public class Main {

    String firstName;

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal animal1 = new Animal(0, "lion", "yellow", 250);

        Animal animal2 = new Animal("Cat", 4, 60, "Cat");
        Animal animal3 = new Animal(4, "Horse", "brown", 400);

        Animal animal4 = new Animal("Giraph", 4);

        animal3.printLegs("Mohamed", "Atef");

        animal4.printLegs();

//
//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Enter width");
//        int width = reader.nextInt();
//        System.out.println("Enter Height");
//        int height = reader.nextInt();
//
//        Animal animal2 = new Animal(width, height);





    }
}
