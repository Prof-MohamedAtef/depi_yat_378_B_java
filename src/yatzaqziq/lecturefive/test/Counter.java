package yatzaqziq.lecturefive.test;

public class Counter {
    private static int count = 0; // Static variable to keep track of instances

    public Counter() {
        count++; // Increment count whenever an object is created
    }

    public static int getCount() { // Static method to retrieve count
        return count;
    }
}
