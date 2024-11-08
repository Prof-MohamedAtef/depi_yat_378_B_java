package yatzaqziq.lecturefive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// write your code here

//        Vehicle vehicle = new Vehicle(0, "asdasd");
//        Vehicle vehicle1 = new Vehicle("Mercedes", "C300", "Car");
//        Vehicle vehicle = new Vehicle();
//
//        new Vehicle("Mercedes", "C300", "Car");
//
//        vehicle.setData("Mercedes", "C300", "#EEEEEE", "Car", true, 4);
//        System.out.println("Hello");
//
//        System.out.println(vehicle.returnData());
//
//        vehicle.returnData(0, "");
//
//        vehicle.returnData("name", 5);

//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Enter Input");
//        String data = reader.nextLine();
//
//        System.out.println("Input=" + data + "\n" + "Input length: " + vehicle.printLength(data));
//
//        String fullName = vehicle.fullNameToLower("MOHAMED", "ATEF");
//        System.out.println(fullName);

//        String hello = "Hello";
//        System.out.println(hello);
//
//        hello += " World!";
//        System.out.println(hello);
//
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        stringBuilder.append(" World!");
//        System.out.println(stringBuilder);
//
//
//        long myLong = 20L;
//
//        float myFloat = 50.0f;
//        int myInt = (int) myLong;
//
//        System.out.println(myInt);
//
//        short myShort = (short) 3.0;

//        Vehicle vehicle = new Vehicle();
//        vehicle.

        Vehicle vehicle = new Vehicle();
//        vehicle.le   /// static members are not accessible through the class object/instance
//        Vehicle.length

//        Counter counter = new Counter();
//        counter.
//        Counter.count

        Constants constants = new Constants();



//        if (constants.getState().equals(Constants.DELIVERED)){
//
//        }

        System.out.println("Color: " + constants.colorCode);
        changeColorCode(constants, 'B');
        System.out.println("Color: " + constants.colorCode);

    }

    public static void changeColorCode(Constants theConstant, char colorCode){
        theConstant = new Constants();
        theConstant.colorCode = colorCode;
    }




}
