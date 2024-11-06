package ictgharbia.lecturefour;

public class Main {

    static TShirt[] tShirtsArray = new TShirt[4];

    public static void main(String[] args) {
        // object - instance => class/Type

//        TShirt xShirt = new TShirt();
//
//        xShirt.type = "FullArm";
//        xShirt.color = "Blue";
//
////        System.out.println(xShirt.type);
////        System.out.println(xShirt.color);
////
////        TShirt tShirt2 = new TShirt();
//
//        TShirt yShirt = new TShirt();
//        yShirt.type = "HalfArm";
//        yShirt.color = "Red";
//
////        System.out.println(yShirt.type);
////        System.out.println(yShirt.color);
//
//        xShirt = yShirt;
//
//        System.out.println(xShirt.type);
//        System.out.println(yShirt.type);


//        newTshirt.clearType();


//        yShirt.clearType();

        // added data through functions

//
//        String[] names = new String[3];
//        names[0] = "Mohamed";
//        names[1] = "Harry";
//        names[2] = "Jack";
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        newTshirt.addTShirt("Full-Arm", "Zara", 36, "Black");
//
//        newTshirt.display();


        TShirt zeroTShirt = new TShirt();

        TShirt firstTShirt = new TShirt();

        TShirt secondTShirt = new TShirt();

        TShirt thirdTShirt = new TShirt();


        tShirtsArray[0] = zeroTShirt;
        tShirtsArray[1] = firstTShirt;
        tShirtsArray[2] = secondTShirt;
        tShirtsArray[3] = thirdTShirt;

        tShirtsArray[0].addTShirt("ZeroShirt", "Zara", 36, "Black");

        zeroTShirt.display();

        System.out.println("------------");

        tShirtsArray[1].addTShirt("FirstShirt", "TownTeam", 36, "White");
        tShirtsArray[1].display();

        System.out.println("------------");

        tShirtsArray[1] = tShirtsArray[0];

        System.out.println(tShirtsArray[1].type);
        System.out.println(tShirtsArray[0].type);

        tShirtsArray[2].addTShirt("SecondShirt", "Lacost", 36, "Black");
        tShirtsArray[2].display();

        System.out.println("------------");

        tShirtsArray[3].addTShirt("ThirdShirt", "TTTT", 36, "Black");
        tShirtsArray[3].display();

        System.out.println("------------");


        tShirtsArray[3].addTShirt("", "UUU", 1, "");
        tShirtsArray[3].display();


        System.out.println("\n------------ \n\nFor Loop\n\n----------\n");

        for (int i = 0; i < tShirtsArray.length; i++) {
            tShirtsArray[i].display();
        }

        int counter = 0;
        for (int i = 0; i < tShirtsArray.length; i++) {
             counter += tShirtsArray[i].size;
        }

        int totalPrice = 0;
        int priceAverage = 0;
        for (int i = 0; i < tShirtsArray.length; i++){
            tShirtsArray[i].price = tShirtsArray[i].size * 2;
            totalPrice += tShirtsArray[i].price;
            if (i == 3){
                priceAverage = totalPrice/i;
            }
        }

        System.out.println("Counter Total: " + counter);

        System.out.println("Total Price: " + totalPrice);

        System.out.println("Price Average: " + priceAverage);


        zeroTShirt.setPrice("FirstTShirt", 50);
        System.out.println(zeroTShirt.type + " " + zeroTShirt.price);
    }
}
