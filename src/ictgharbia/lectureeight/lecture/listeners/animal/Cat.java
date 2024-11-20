package ictgharbia.lectureeight.lecture.listeners.animal;

import ictgharbia.lectureeight.lecture.listeners.animal.listener.CatI;

public class Cat implements CatI {
    @Override
    public void defineCat() {
        System.out.println("I am cat");
    }
}
