package yatzaqziq.lecturefive;

public class Vehicle {
    // attributes - properties - characteristics
    boolean hasWheels;
    int wheelsNumber;
    String brand;
    String model;
    String color;
    String type;

    public Vehicle(int wheelsNumber, String type) {
        this.wheelsNumber = wheelsNumber;
        this.type = type;
    }

    public Vehicle() {
    }

    public Vehicle(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public Vehicle(String brand, String model, String color, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public void setData(String brand, String model, String color, String type, boolean hasWheels, int wheelsNumber){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.hasWheels = hasWheels;
        this.wheelsNumber = wheelsNumber;

    }

    public String returnData(){
        String message  = "Type: " + this.type + "\n" + "Brand: " + this.brand + "\n" + "Model: " + this.model + "\n" + "Color: " + this.color + "" ;
        if (hasWheels){
            message += " Wheels Number: " + this.wheelsNumber;
            return message;
        }else {
            return message;
        }
    }

    public int returnData(String name, int y){
        return 0;
    }

    public void returnData(int x, String name){

    }

    public String setName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public double returnData(double z, float n){
        return z * n;
    }


    public int printLength(String str){
        return str.length();
    }


    public String printLength(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName.toLowerCase();
    }

    public String fullNameToLower(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName.toLowerCase();
    }
}
