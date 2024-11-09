package ictgharbia.lecturefive;

public class Accountant {

    int totalSales;

    public void countSales(int sunday, int monday, int tuesday, int wednesday, int thursday) {
        int counter = 0;
        counter += sunday;
        counter += monday;
        counter += tuesday;
        counter += wednesday;
        counter += thursday;
        System.out.println("Sales of the week are: " + counter);

        totalSales = counter;
    }



    public void countTax(){
        double tax = totalSales * 0.1;
        System.out.println("Total tax is $" + tax);
    }
}
