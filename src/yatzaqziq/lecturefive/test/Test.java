package yatzaqziq.lecturefive.test;

public class Test {
    final String SUMMER = "SUMMER";
    final String WINTER = "WINTER";
    final String SPRING = "SPRING";
    final String AUTUMN = "AUTUMN";

    final int YEAR_CHAPTERS = 4;
    final int YEAR_MONTHS = 12;
    final int MONTH_DAYS = 30;
    final int MONTH_WEEKS = 4;
    final int WEEK_DAYS = 7;
    final int DAY_HOURS = 24;
    final int HOUR_MINUTES = 60;
    final int MINUTE_SECONDS = 60;

    public static void main(String[] args) {

        // short
        short a, b;
        int c;
        a = 1;
        b = 2;
        c = (short) (a + b);

        // long
        int age = 32;

        int ageDays = age * 365;
        long ageSeconds = ageDays * 24L * 60 * 60;
        System.out.println(ageSeconds);
        System.out.println(ageDays);

        // double
        int num1 = 1 + 2;
        int num2 = (int) ((2 + 3) * 2.0);

        //float
//        float float1 =(float) 27.3;
        float float1 = 27.3f;

        // static
        System.out.println(ItemSizes.LARGEST);

        int factorial = MathUtils.factorial(5);
        double power = MathUtils.power(3, 2);
        System.out.println(factorial);
        System.out.println(power);

        Logger logger = Logger.getInstance();
        logger.log("Singleton pattern example");


        Counter counter = new Counter();
        new Counter();
        new Counter();



        System.out.println("Total instances: " + Counter.getCount()); // Output: Total instances: 3

        System.out.println("Value of PI: " + Constants.PI); // Output: Value of PI: 3.14159
        System.out.println("Value of E: " + Constants.E);   // Output: Value of E: 2.71828


        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(25); // 77.0
        double celsius = TemperatureConverter.fahrenheitToCelsius(77);    // 25.0

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);


        // this is a thread-safe approach and does not require a synchronization keyword.
        Singleton singleton = Singleton.getInstance();

        // passing arguments to methods in memory changes
        Shirt myShirt = new Shirt();
        System.out.println("Shirt Color: " + myShirt.colorCode);
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt Color: " + myShirt.colorCode);

    }

    public static void changeShirtColor(Shirt theShirt, char color){
        theShirt = new Shirt();
        theShirt.colorCode = color;
    }
}
