package yatzaqziq.lectureseven.lecture.animal;

public class Animal {
    int legs;
    int eyes;
    String color;
    String title;

    public Animal(int legs, int eyes, String color, String title) {
        this.legs = legs;
        this.eyes = eyes;
        this.color = color;
        this.title = title;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void printAnimal() {
        System.out.println("Animal is printing: " + this.title + " " + this.eyes + " " + this.legs + " " + this.color);
    }
}
