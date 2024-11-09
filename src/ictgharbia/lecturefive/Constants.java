package ictgharbia.lecturefive;

public class Constants {
    public static final double TAX = 0.1;
    public static final double MANAGERIAL_EXPENSES = 5000.0;
    public static final String BASE_URL = "https://www.google.com";

    public static final String MOST_POPULAR = "/movies/popular/index.json";

    public static final String TOP_RATED = "/movies/rated/index.json";

    public static double updateMgmtExpenses(double expenses){
        expenses += MANAGERIAL_EXPENSES;
        return expenses;
    }
}
