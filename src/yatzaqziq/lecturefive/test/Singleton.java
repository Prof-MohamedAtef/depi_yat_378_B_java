package yatzaqziq.lecturefive.test;

public class Singleton {
    private Singleton() {}

    // Static inner class holds the single instance, loaded only when needed
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
