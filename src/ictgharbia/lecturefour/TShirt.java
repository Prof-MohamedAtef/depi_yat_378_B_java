package ictgharbia.lecturefour;

// class
public class TShirt {

    // characteristics - attributes - fields - properties
    String type;
    String brand;
    int size;
    String color;
    double price;

    public TShirt(){

    }

    // input
    public void addTShirt(String type, String brand, int size, String color) {
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void setPrice(String type, double price) {
        this.price = price;
        this.type = type;
    }


    public void display() {
        System.out.println("New TShirt: \nType: " + type + "\nBrand: " + brand + "\nSize: " + size
                + "\nColor: " + color);
    }
    // adding functions

    public void clearType(){

    }

}