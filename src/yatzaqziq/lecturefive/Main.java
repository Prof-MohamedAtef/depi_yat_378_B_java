package yatzaqziq.lecturefive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// write your code here

//        Vehicle vehicle = new Vehicle(0, "asdasd");
//        Vehicle vehicle1 = new Vehicle("Mercedes", "C300", "Car");
        Vehicle vehicle = new Vehicle();

        new Vehicle("Mercedes", "C300", "Car");

        vehicle.setData("Mercedes", "C300", "#EEEEEE", "Car", true, 4);
        System.out.println("Hello");

        System.out.println(vehicle.returnData());

        vehicle.returnData(0, "");

        vehicle.returnData("name", 5);

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter Input");
        String data = reader.nextLine();

        System.out.println("Input=" + data + "\n" + "Input length: " + vehicle.printLength(data));

        String fullName = vehicle.fullNameToLower("MOHAMED", "ATEF");
        System.out.println(fullName);
    }
}
