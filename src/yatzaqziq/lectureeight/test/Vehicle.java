package yatzaqziq.lectureeight.test;

abstract class Vehicle {
    String name;
    Vehicle(String name){
        this.name = name;
    }

    public void move(){
        System.out.println("Car is moving ...");
    }
}
