package yatzaqziq.lectureeight.abstractmemebers.animals;

public class Dog extends Animal implements Pet{
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {

    }

    @Override
    public void play() {

    }

    public void run() {
        System.out.println("Overriding: This animal is running.");
    }
}
