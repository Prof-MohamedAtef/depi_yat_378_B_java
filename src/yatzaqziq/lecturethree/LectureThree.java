package yatzaqziq.lecturethree;

import java.util.Arrays;

public class LectureThree {
    public static void main(String[] args) {

        int x = 5;
        int[] numsArray = new int[x]; // new array initialization
        numsArray[0] = 10;
        numsArray[1] = 500;
        numsArray[2] = 15;
        numsArray[3] = 200;
        numsArray[4] = 25;

        int[] numbers = {5, 2, 8, 100000};

        String name = "Mohamed";
        String[] namesArray = new String[6];
        namesArray[0] = "Mohamed";
        namesArray[1] = "Atef";
        namesArray[2] = "Mahmoud";
        namesArray[3] = "Sally";
        namesArray[4] = "Ebrahim";
        namesArray[5] = "Haneen";
//        namesArray[7] = "Ali";


        String[] names = {"ahmed", "mohamed", "Mostafa"};


        // control flow statements
        // for loop
        // One-dimensional array / Single Dimensional Array
        System.out.println("Small Names array as follows:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("");

        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }
        System.out.println("Updating Values:");

        for (int i = 0; i < namesArray.length; i++) {
            if (i == 4 || i == 5) {
                namesArray[i] = names[i-4];
            }
            System.out.println(namesArray[i]);
        }


        // control statements
//        switch statement
//        int weight, height;
//        weight = 10;
//        height = 180;
//
//        switch (weight) {
//            case 10:
//                System.out.println("Your weight is 10%");
//                break;
//            case 20:
//                System.out.println("Your weight is 20%");
//                break;
//            case 80:
//                System.out.println("Your weight is 80%");
//                break;
//            default:
//                System.out.println("My default case");
//        }
//
//
//


        // if statement
//        int weight, height;
//        weight = 80;
//        height = 180;
//        if (weight == height){
//            System.out.println("Weight is equal");
//        }else if (weight > height){
//            System.out.println("Weight is greater than height");
//        }else if (weight < height){
//            System.out.println("Weight is less than height");
//        }else {
//            System.out.println("Undefined");
//        }


    }
}
