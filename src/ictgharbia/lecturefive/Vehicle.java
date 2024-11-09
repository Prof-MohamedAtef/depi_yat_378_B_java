package ictgharbia.lecturefive;

public class Vehicle {
    public void run(){
        System.out.println("Vehicle run");
    }

    public void countDistance(int km){
        int distance = km * 1000;
        System.out.println("Distance: " + distance);
    }
}
