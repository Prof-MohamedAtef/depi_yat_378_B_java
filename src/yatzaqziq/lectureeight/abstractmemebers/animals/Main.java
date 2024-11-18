package yatzaqziq.lectureeight.abstractmemebers.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.play();
        dog.sound();
        dog.eat();
        dog.meow();

        Pet.description();

        dog.run();
    }
}
