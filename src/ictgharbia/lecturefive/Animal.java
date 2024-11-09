package ictgharbia.lecturefive;

public class Animal {

    int legs;

    String name;

    String color;

    int weight;

    int length;
    String subTitle;

    // signature

    // parameterized constructor
    public Animal(int legs, String name, String color, int weight) {
        this.legs = legs;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Animal(int legs, String name, int length, String color){
        this.legs = legs;
        this.name = name;
        this.color = color;
        this.weight = length;
    }

    public Animal(String name, int legs, int length, String subTitle){
        this.legs = legs;
        this.name = name;
        this.length = length;
        this.subTitle = subTitle;
    }



    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public Animal(int width, int height){
        int area = width * height;
        System.out.println("Area:" + area);
    }

    // default constructor // parameterless constructor
    public Animal() {
    }





}
// parameters parameterless