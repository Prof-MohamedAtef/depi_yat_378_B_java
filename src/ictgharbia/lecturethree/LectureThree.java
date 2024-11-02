package ictgharbia.lecturethree;

public class LectureThree {
    public static void main(String[] args) {
        // Control Flow Statements

        // Arrays

//        int x = 5;
//        int z = 4;
//        int y = 3;
//        int f = 2;
//        int r = 1;
//        int p = 0;

        // One-Dimensional Array

        int[] numsArray = new int[8]; // size = 5

        // index -> indices
        numsArray[0] = 1;
        numsArray[1] = 2;
        numsArray[2] = 3;
        numsArray[3] = 4;
        numsArray[4] = 5;
        numsArray[5] = 6;
        numsArray[6] = 7;
        numsArray[7] = 8;
//        numsArray[8] = 9;

        System.out.println(numsArray);

        // Control flow statements
//        for loop

        // iterate  - loop
        for (int i = 0; i < numsArray.length; i++){
            if (i == 2){  // numsArray[i] => value
                numsArray[i] = 20;
            }
            System.out.println(numsArray[i]);
        }

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
