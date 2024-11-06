package ictgharbia.lecturefour;

public class Main {
    public static void main(String[] args) {
        // object - instance => class/Type

        TShirt xShirt = new TShirt();

        xShirt.type = "FullArm";
        xShirt.color = "Blue";

//        System.out.println(xShirt.type);
//        System.out.println(xShirt.color);
//
//        TShirt tShirt2 = new TShirt();

        TShirt yShirt = new TShirt();
        yShirt.type = "HalfArm";
        yShirt.color = "Red";

//        System.out.println(yShirt.type);
//        System.out.println(yShirt.color);

        xShirt = yShirt;

        System.out.println(xShirt.type);
        System.out.println(yShirt.type);

    }
}
