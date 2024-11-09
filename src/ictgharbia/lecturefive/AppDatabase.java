package ictgharbia.lecturefive;

public class AppDatabase {
    private static AppDatabase APP_DATABASE_INSTANCE;
    public static AppDatabase getDatabaseInstance() {
        if (APP_DATABASE_INSTANCE == null) {
            APP_DATABASE_INSTANCE = new AppDatabase();
        }
        return APP_DATABASE_INSTANCE;
    }
}