package yatzaqziq.lecturefive.test;

public class Logger {

    // Static variable to hold the single instance
    private static Logger instance;

    // Static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example log method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
