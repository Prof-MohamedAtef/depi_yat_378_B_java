import java.util.Arrays;
import java.util.Scanner;

public class SfourSession {
    public static void main(String[] args) {
// control flow statements - If statement and IF Else statement


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = reader.next();
        System.out.println("My name is: " + name);
        System.out.println("How old are you?");
        int age = reader.nextInt();
        System.out.println("Age is: " + age);
        System.out.println("Which company do you work at?");
        String companyName = reader.next();
        System.out.println("Company name is: " + companyName);
        char emailLetter = '@';
        System.out.println("So, your email should be: " + name + emailLetter + companyName);
        System.out.println("Would you like to join DEPI?");
        String isJoining = reader.next();
        if (isJoining.toLowerCase().equals("yes")) {
            System.out.println("I registered you in DB");
        }else {
            System.out.println("I have not registered you in DB");
        }
//        boolean isJoining = reader.nextBoolean();
//        if (isJoining) {
//            System.out.println("I registered you in DB");
//        }else {
//            System.out.println("I have not registered you in DB");
//        }


        // Ternary Operator

//        boolean isRaining = true;
//
//        String message = (isRaining) ? "Weather is raining!" : "Weather is not raining!";
//        System.out.println(message);
//
//        int number = 11;
//
//        String numState = (number % 2 == 0) ? "Even number" : "Odd number";
//        System.out.println(numState);

        // Unary operators
//        ++
//        --
//        !
//        int n = 5;
//        n++;
//
//        System.out.println(n);
//        n --;
//        System.out.println(n);

        // Logical Operators
        // if else statement then Logical Operators
        //&&, ||, !

//        int firstShot, secondShot;
//        boolean isPlaying, isRaining;
//        firstShot = 25;
//        secondShot = 30;
//        isPlaying = false;
//        isRaining = true;
//
//        if ((firstShot > secondShot && !isPlaying) || (isRaining && !isPlaying)) {
//            if (firstShot > secondShot && !isPlaying){
//                isPlaying = true;
//                System.out.println(isPlaying);
//            }else if(isRaining && !isPlaying){
//                isPlaying = false;
//                System.out.println(isPlaying);
//            }
//        } else {
//            System.out.println("If is returning false");
//        }

        // Relational Operators
//        ==, !=, >, <, >=, <=
        // if else statement then Relational Operators
//        int width, height;
//        width = 15;
//        height = 12;
//        if (width == height){
//            System.out.println("If is returning true");
//        } else {
//            System.out.println("If is returning false");
//        }
//
//        if (width != height){
//            System.out.println("Not equal");
//        }
//
//        if (width > height){
//            System.out.println("Width is greater than height");
//        }else if (width < height){
//            System.out.println("Width is smaller than height");
//        }
//
//        if (width >= height){
//            System.out.println("Width is greater than or equal height");
//        } else if (width <= height){
//            System.out.println("Width is smaller than height");
//        }

//        // assignment operators
//        //=, equal assignment operator
//
//        int width, height;
//        width = 8;
//        height = 12;
//        int total = width * height;
//        System.out.println(total);
//
//        // +=,
//
//        total += 4;
//        System.out.println(total);
//        // -=,
//
//        total -= 3;
//        System.out.println(total);
//        // *=,
//
//        total *= 2;
//        System.out.println(total);
//        // /=,
//
//        total /= 2;
//        System.out.println(total);
//        // %=
//
//        total %= 4;
//        System.out.println(total);


//        // arithmetic / mathematical operators
//
//        int width, height;
//        width = 8;
//        height = 12;

//        // modulus/reminder  operator
//        int remainder = height % width;
//        System.out.println(remainder);

//        // division operator /
//        int division = width / height;
//        System.out.println(division);

//        // multiply operator *
//        int multiply = width * height;
//        System.out.println("Multiplication value : " + multiply);


//        int width, height;
//        width = 8;
//        height = 12;
//        // sum operator +
//        int sum = width + height;
//        System.out.println("Area of Rectangle: " + sum);

        //ASCII Table (Decimal Code Representation)
//        String firstName; // definition -- declaration
//        firstName = "Mohamed Atef"; //immutable data type
//        firstName = "Ahmed Atef";
//        System.out.println(firstName);

//          // 8 primitives are saved into stack and considered as mutable data types
//        boolean isDone = true;
//        System.out.println(isDone);

//        // stack - primitive - mutable
//        char myCharacter = 's';
//        System.out.println("my character is: " + myCharacter);
//        // stack
//        double myDoubleData = 653.3;
//        System.out.println(myDoubleData);

        // saved into stack as it's mutable / primitive data type
//        float myFloatNum = 9.2f;
//        System.out.println(myFloatNum);

        // stack - primitive / mutable data type
//        long myLongDataType = 99L;
//        System.out.println("myLongDataType: " + myLongDataType);

//        //stack --> primitive and mutable data type
//        short myShortVariable = 3;
//        System.out.println("myShortVariable: " +myShortVariable);

        // stack -> mutable / primitive data type
//        byte myByteVariable = 8; // definition - declaration => initialization
//        System.out.println("Byte variable = " + myByteVariable);


        // int is saved into stack as it's primitive / mutable data type - stack allocation
        // int data type
//        int width; // declaration - definition
//        int height;
//
//        width = 8; // initial value
//        height = 4;
//
//        // multiply width by height
//
//        System.out.println("Multiplication of Width = " + width + ", and height = " + height + " = " + (width*height));
    }
}
