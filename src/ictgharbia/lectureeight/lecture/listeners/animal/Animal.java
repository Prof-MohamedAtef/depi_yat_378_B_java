package ictgharbia.lectureeight.lecture.listeners.animal;

public class Animal {
    int legs;
    int eyes;
    String color;
    public Animal(){}
    public Animal(int legs, int eyes, String color) {
        this.legs = legs;
        this.eyes = eyes;
        this.color = color;
    }

    public void printLegs(){
        System.out.println(legs);
    }
}
