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

    public void countSales(int daySale){
        totalSales = daySale;
        System.out.println("Sales of the day is: " + totalSales);
    }


    public void countSales(int [] weeks){
        for (int i = 0; i < weeks.length; i ++){
            totalSales = totalSales + weeks[i];
        }
        System.out.println("Sales of the Month is: " + totalSales);
    }

    public void countTax(){
        double tax = totalSales * Constants.TAX;
        System.out.println("Total tax is $" + tax);
    }


}
