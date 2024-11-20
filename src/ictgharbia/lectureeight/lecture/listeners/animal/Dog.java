package ictgharbia.lectureeight.lecture.listeners.animal;

import ictgharbia.lectureeight.lecture.listeners.animal.listener.AnimalI;
import ictgharbia.lectureeight.lecture.listeners.animal.listener.DogI;

public class Dog implements DogI {

    @Override
    public void parking() {
        System.out.println("Dog is parking...");
    }
}
