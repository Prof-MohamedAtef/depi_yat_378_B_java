package ictgharbia.lecturethree;

public class LectureThree {
    public static void main(String[] args) {
        // Control Flow Statements

        // Arrays


        // String Array

//        boolean[] isPlaying = new boolean[10];
//        for (int i = 0; i < isPlaying.length; i++){
//            if (i == 5){
//                isPlaying[i] = true;
//            }
//            System.out.println(isPlaying[i]);
//        }

        String[] friends = new String[3];
        friends[0] = "Joe";
        friends[1] = "Bob";
        friends[2] = "Jane";
        System.out.println("-----------\n\n");

        String[] namesArr = new String[10];

        namesArr[0] = "Mohamed";
        namesArr[1] = "John";
        namesArr[2] = "Samar";
        namesArr[3] = "Rana";
        namesArr[4] = "Basmala";
        namesArr[5] = "James";


        for (int i = 0; i < namesArr.length; i++){

            if (i == 6){
                System.out.println("\n------\n");
                namesArr[6] = friends[i - 6];
            } else if (i == 7) {
                namesArr[7] = friends[i - 6];
            } else if (i == 8) {
                namesArr[8] = friends[i - 6];
            }

            System.out.println(namesArr[i] + " on index: " + i);
        }

//        String[] names = new String[6];
//        for (int i = 0; i < names.length; i++){
//            names[i] = "Name" + i;
//            System.out.println(names[i]);
//        }
//        int x = 5;
//        int z = 4;
//        int y = 3;
//        int f = 2;
//        int r = 1;
//        int p = 0;

        // One-Dimensional Array

//        int[] numsArray = new int[8]; // size = 5
//
//        // index -> indices
//        numsArray[0] = 1;
//        numsArray[1] = 2;
//        numsArray[2] = 3;
//        numsArray[3] = 4;
//        numsArray[4] = 5;
//        numsArray[5] = 6;
//        numsArray[6] = 7;
//        numsArray[7] = 8;
////        numsArray[8] = 9;
//
//        System.out.println(numsArray);
//
//        // Control flow statements
////        for loop
//
//        // iterate  - loop
//        for (int i = 0; i < numsArray.length; i++) {
//            if (i == 2) {  // numsArray[i] => value
//                numsArray[i] = 20;
//            }
//            System.out.println(numsArray[i]);
//        }

        // Garbage Collector - > Clear unused resources

//        // Strings - Mutable data type --> Heap -> reference in stack
//        String name = "Mohamed";
//        System.out.println(name);
//        System.out.println("Name Before Update was in: " + System.identityHashCode(name));
//
//        name = "Ahmed";
//        System.out.println(name);
//        System.out.println("Name After Update was in: " + System.identityHashCode(name));


        // switch statement

//        int width = 100;
//        switch (width){
//            case 20:
//                System.out.println("Width is 20");
//                break;
//            case 50:
//                System.out.println("Width is 50");
//                break;
//            case 80:
//                System.out.println("Width is 80");
//                break;
//            default:
//                System.out.println("Invalid data");
//                break;
//        }

//        // if Statement
//        int width = 20, height = 20;
//        if (width == height){
//            System.out.println("The width and height are the same");
//        }

        // Con
    }
}
