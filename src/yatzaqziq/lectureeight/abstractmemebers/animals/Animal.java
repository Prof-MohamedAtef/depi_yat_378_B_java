package yatzaqziq.lectureeight.abstractmemebers.animals;

abstract public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    Animal(){}

    abstract void sound(); // Abstract method

    void eat() {
        System.out.println(name + " is eating.");
    }
}
