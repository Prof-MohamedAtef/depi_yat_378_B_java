package yatzaqziq.lecturesix.test;

import yatzaqziq.lecturesix.lecture.Book;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Mercedes", 4);
        vehicle.setMoveDate(LocalDate.now());
        System.out.println(vehicle.getMoveDate());

        vehicle.setJapaneseDate(JapaneseDate.from(LocalDate.now()));
        System.out.println(vehicle.getJapaneseDate());

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            if (i == 2 || i ==5)
                break; // compared with continue
            System.out.println(arr[i]);
        }
//
//        int [][] yearlySalesArr = new int[3][3];
//        yearlySalesArr[0][0] = 1000;
//        yearlySalesArr[0][1] = 1500;
//        yearlySalesArr[0][2] = 1800;
//        yearlySalesArr[1][0] = 1000;
//        yearlySalesArr[1][1] = 1500;
//        yearlySalesArr[1][2] = 1800;
//        yearlySalesArr[2][0] = 1000;
//        yearlySalesArr[2][1] = 1500;
//        yearlySalesArr[2][2] = 1800;
//
//        for (int i = 0; i < yearlySalesArr.length; i++) {
//            for (int j = 0; j < yearlySalesArr[i].length; j++) {
//                if (i == 0)
//                    continue;
//                System.out.print(yearlySalesArr[i][j]+" | ");
//            }
//
//            System.out.println();
//        }

        int height = 6;
        int width = 5;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("#");
            }
            System.out.println();
        }


        ArrayList<Book> bookArrayList = new ArrayList<>();
        Book book = new Book("mohamed", "Boook", "Published");
        Book book2 = new Book("ahmed", "Boook", "Published");
        Book book3 = new Book("atef", "Boook", "Published");

        bookArrayList.add(book);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        if (bookArrayList.contains(book)) {
            bookArrayList.remove(book);
        }
        for (Book b : bookArrayList) {
            System.out.println(b.getAuthorName());
        }

        bookArrayList.add(2, book);

        for (Book b : bookArrayList) {
            System.out.println(b.getAuthorName());
        }
    }
}
