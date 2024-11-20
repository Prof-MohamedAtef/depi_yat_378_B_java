package ictgharbia.lectureeight.lecture.animals;

// Base Class - Super Class - Parent Class
abstract public class Animal {
    private int legs;
    private int eyes;
    private int ears;
    private String color;
    private String sound;

    public Animal(){}

    public Animal(int legs, int eyes) {
        this.legs = legs;
        this.eyes = eyes;
    }

    private void run(){
        System.out.println("Running...");
    }

    // method overriding
    public void eat(){
        System.out.println("Eating...");
    }

    abstract public void smell() ;

    abstract public void sound();
    abstract public void see();

}
