package ictgharbia.lectureeight.lecture.listeners;

import ictgharbia.lectureeight.lecture.listeners.animal.Cat;
import ictgharbia.lectureeight.lecture.listeners.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.defineDog();
        dog.parking();

        Cat cat = new Cat();
        cat.defineCat();
        System.out.println("Cat speed: " + cat.measureSpeed() + "km/hr");


    }
}
