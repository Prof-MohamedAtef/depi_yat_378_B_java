package yatzaqziq.lecturesix.lecture;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Tahah Hussein", "Al Ayam", "Dar Misr");
        book.setTitle("Al Ayam");
        book.setAuthorName("Taha Hussein");
        book.setPublisher("Dar Misr");

        System.out.println(book.getTitle() + " " + book.getAuthorName() + " " + book.getPublisher());

        Item item = new Item("Cheese", 150, 3, "30-11-2024", "Dommti");

        System.out.println(item.printData());

        Item item1 = new Item("Bescuets", 250, 5, "30-11-2024", "Besco Misr");
        System.out.println(item1.printData());

        String firstName = "Mohamed Atef";
        String secondName = "Mohamed Atef";

        String thirdName = "Mohamed Atef";
        String fourthName = "Mohamed Atef";

        System.out.println("\n---------\n");
        if (firstName.equals(secondName) && thirdName.equals(fourthName)) {
            if (firstName.equals(secondName)) {
                System.out.println(firstName + " Twice Equal " + secondName);
            } else if (thirdName.equals(fourthName)) {
                System.out.println(thirdName + " Third Equal " + fourthName);
            }
        } else {
            System.out.println("Not Equal");
        }

        System.out.println("\n--------\n");

        String message = (firstName.equals(secondName)) ? "Equal" : "Not Equal";
        System.out.println(message);


        int goalsNumber = 0;
        goalsNumber = 3;

        System.out.println("I Scored " + goalsNumber + " " + (goalsNumber == 1 ? "goal" : "goals"));

        Students mohamedStudent = new Students(20, "Mohamed", false, false, false, 0);
        Students ahmedStudent = new Students(22, "Ahmed", false, false, false, 0);

        if (mohamedStudent.getAge() == ahmedStudent.getAge()) {
            System.out.println("Mohamed equal Ahmed in age : " + mohamedStudent.getAge());
        } else {
            if (mohamedStudent.getAge() > ahmedStudent.getAge()) {
                System.out.println("Mohamed is Greater than Ahmed in Age");
            } else if (ahmedStudent.getAge() > mohamedStudent.getAge()) {
                System.out.println("Ahmed is Greater than Mohamed in Age");
                ahmedStudent.setGraduated(false);
                ahmedStudent.setMarried(true);
                ahmedStudent.setHasSon(false);
                if (ahmedStudent.isGraduated()) {
                    System.out.println("Ahmed has Graduated");
                    if (!ahmedStudent.isMarried()) {
                        System.out.println("Ahmed Has not married");
                    } else System.out.println("Ahmed has Married");
                } else {
                    System.out.println("Ahmed has not graduated");
                    if (!ahmedStudent.isMarried()) {
                        System.out.println("Ahmed has not married");
                    } else System.out.println("Ahmed has married");
                }
            }
        }


        LocalDate localDate = LocalDate.now();
//        String month = localDate.getMonth().toString();
//        System.out.println(month);
//
//        int dayOfMonth = localDate.getDayOfMonth();
//        System.out.println("Day Of Month: " + dayOfMonth);
//
//        int monthValue = localDate.getMonthValue();
//        System.out.println("Month of Year: " + monthValue);
//
//        int year = localDate.getYear();
//        System.out.println("Year: " + year);
//
//        System.out.println("Date: " +dayOfMonth+"/"+monthValue+"/"+year);
//
//        String pattern = "MM-dd-yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        String date = simpleDateFormat.format(new Date());
//        System.out.println(date);

//        LocalDate date = LocalDate.of(2024, 11, 6);
//
//        // Format date as "6 Nov, 2024"
//        String formattedDate = date.format(DateTimeFormatter.ofPattern("d MMM, yyyy"));
//
//        // Append the ordinal suffix
//        String dayWithSuffix = addOrdinalSuffix(date.getDayOfMonth());
//        String finalFormattedDate = dayWithSuffix + formattedDate.substring(1);
//
//        System.out.println(finalFormattedDate); // Output: 6th Nov, 2024

//        LocalDate date = LocalDate.of(1992, 11, 6);
//        String formattedDate = date.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"));
//        System.out.println(formattedDate);


//        int[] arr = new int[4];
//
//        for (int i = 0; i < arr.length; i ++){
//            arr[i] = i*3;
//            System.out.println(arr[i]);
//        }
//
//        int row = 3;
//        int column = 3;
//
//        int[][] twoDimensionalArr = new int[row][column];
//
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < column; j++) {
//                twoDimensionalArr[i][j] = ((i+j)*2);
//            }
//        }
//        for (int i= 0; i< row; i++){
//            for (int j = 0; j < column; j++) {
//                System.out.print(twoDimensionalArr[i][j] + " | ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Rows of the Matrix");
        int row = scanner.nextInt();
        System.out.println("Enter Columns of the Matrix");
        int column = scanner.nextInt();
        int[][] twoDimensionalArr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter Value of ["+i+"]"+"["+j+"]");
                int x = scanner.nextInt();
                twoDimensionalArr[i][j] = x;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(twoDimensionalArr[i][j]);
            }
        }


    }


//    private static String addOrdinalSuffix(int day) {
//        if (day >= 11 && day <= 13) {
//            return day + "th";
//        }
//        switch (day % 10) {
//            case 1:  return day + "st";
//            case 2:  return day + "nd";
//            case 3:  return day + "rd";
//            default: return day + "th";
//        }
//    }
}
