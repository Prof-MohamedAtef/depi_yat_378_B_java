package ictgharbia.lecturesix;

import yatzaqziq.lectureseven.test.Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle(4, "Mercedes");  // constructor overloading
//        Vehicle vehicle1 = new Vehicle()

//        vehicle.brand = "BMW";

//        System.out.println(
//                vehicle.printVehicle()
//        );
//
//        vehicle.setBrand("RENAULT");
//        System.out.println(
//                vehicle.printVehicle()
//        );


        // encapsulation


//        PublicTax publicTax = new PublicTax();

//        publicTax.publicTax = 0.0000000001;

//        int total = 150000;
//        double tax = publicTax.publicTax * total;

//        System.out.println(
//                "Total value: = " + total +
//                "Tax value: = " + tax
//        );

//        if (publicTax.getPublicTax() >= 0.2){
//            System.out.println("Public Tax = " + publicTax.getPublicTax());
//        }else if (publicTax.getPublicTax() <= 0.003) {
//            System.out.println("Public Tax = " + publicTax.getPublicTax());
//        }else if (publicTax.getPublicTax() == 0.03) {
//            System.out.println("Public Tax = " + publicTax.getPublicTax());
//        }else {
//            System.out.println("Public Tax is unknown");
//        }


//        String university = "cairo university";
//        String UniversityCouncil = "CAIRO UNIVERsity";
//
//        boolean isPlaying = true;
//
//        boolean isDrawing = true;
//
//        boolean isShowing = true;

//        boolean isEqual = true;
//
//        if ((isEqual && isPlaying) || (isDrawing && isShowing)) {
//            if (isEqual || isPlaying){
//                System.out.println("Equal");
//            }else if(isDrawing || isShowing){
//                System.out.println("Equal");
//            }
//        } else {
//            System.out.println("Not Equal");
//        }


//        String message = (isPlaying) ? "Match is still in progress!" : "Match has finished!";
//        System.out.println(message);
//
//        int[] months = {1, 3, 5, 7, 8, 10, 12};
//        for (int i = 0; i < months.length; i++) {
//            switch (months[i]) {
//                case 1:
//                    System.out.println("January - 31 Days");
//                    break;
//                case 3:
//                    System.out.println("March - 31 Days");
//                    break;
//                case 5:
//                    System.out.println("May - 31 Days");
//                    break;
//                default:
//                    System.out.println("Invalid Month");
//                    break;
//            }
//        }

//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//
//        LocalDate dayDate =  now.plusDays(4);
//        System.out.println(dayDate);
//
//        int year = now.getYear();
//        System.out.println(year);
//
//        int month = now.getMonthValue();
//        System.out.println(month);
//
//        int day = now.getDayOfMonth();
//        System.out.println(day);
//
//        DayOfWeek dayOfWeek = now.getDayOfWeek();
//        int datOfWeekValue = dayOfWeek.getValue();
//        System.out.println(datOfWeekValue);
//
//        String displayDayTitle= dayOfWeek.toString();
//        System.out.println(displayDayTitle);
//
//        String monthDisplayTitle = now.getMonth().toString();
//        System.out.println(monthDisplayTitle);
//
//        String formattedDateDay = now.format(DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy"));
//        System.out.println(formattedDateDay);
//
//        String normalDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(normalDate);
//
////
//        String normalDate1 = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(normalDate1);
//
//        String normalDate2 = now.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
//        System.out.println(normalDate2);
//
//        String normalDate3 = now.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
//        System.out.println(normalDate3);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String normalDate4 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println(normalDate4);
//
//

//        dd MMM yyyy hh:mm a
//        yyyy-MM-dd'T'HH:mm:ss.SSS'Z'


        // Two Dimensional Array

//        int [] nums = new int[10];
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        // create a matrix with 2D array
        // row 3
        // columns 3
//        int row, column;
//        row = 3;
//        column = 3;
//        int[][] numbers = new int[row][column];
//
//        int[][] secondNums = new int[row][column];
//
////        numbers[0][0] = 0;
//        numbers[0][1] = 60;
//        numbers[0][2] = 70;
//        numbers[1][0] = 80;
//        numbers[1][1] = 90;
////        numbers[1][2] = 0;
//        numbers[2][0] = 120;
//        numbers[2][1] = 130;
////        numbers[2][2] = 0;

//        int initialValue = 25;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                initialValue += 25;
//                numbers[i][j] = initialValue;
//            }
//        }
//
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                System.out.print(numbers[i][k] + " | ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                secondNums[i][k] = numbers[i][k] * numbers[i][k];
//            }
//        }
//
//        System.out.println("\n----(numbers^2)----\n");
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                System.out.print(secondNums[i][k] + " | ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n----(Average of Numbers)----\n");
//
//        int averageCounter = 0;
//        int loopsNumber = 0;
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                averageCounter += numbers[i][k];
//                loopsNumber++;
//                System.out.print(averageCounter + " | ");
//            }
//            System.out.println();
//        }
//
//        int average = averageCounter / loopsNumber;
//        System.out.println("Total Values: " + averageCounter);
//        System.out.println("Number of Iterations: " + loopsNumber);
//        System.out.println("Average of Numbers: " + average);
//
//        String[][] names = new String[row][column];
//        names[0][0] = "Mohamed";
//        names[0][1] = "Ahmed";
//        names[0][2] = "Ismail";
//
//        System.out.println("\n-----Names-----\n");
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                System.out.print(names[i][k] + " | ");
//            }
//            System.out.println();
//        }
//
//        Scanner reader = new Scanner(System.in);
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                System.out.println("Enter New Value when Names is at index: " + "[" + i + "]" + "[" + k + "]");
//                names[i][k] = reader.next();
//            }
//        }
//
//        for (int i = 0; i < row; i++) {
//            for (int k = 0; k < column; k++) {
//                System.out.print(names[i][k] + " | ");
//            }
//            System.out.println();
//        }

        Vehicle vehicle = new Vehicle(4, "Toyota", "Corolla");
//        vehicle.
        vehicle.printVehicle();
    }
}
