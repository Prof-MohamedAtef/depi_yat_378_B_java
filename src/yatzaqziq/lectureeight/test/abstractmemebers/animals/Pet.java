package yatzaqziq.lectureeight.test.abstractmemebers.animals;

public interface Pet {
    void play();

    // Default method with implementation
    default void meow() {
        System.out.println("This animal is meowing.");
    }

    // Static method for utility
    static void description() {
        System.out.println("Animals are living beings with diverse characteristics.");
    }

    default void run() {
        System.out.println("This animal is running.");
    }

    default void isPlaying(){

    }
}

