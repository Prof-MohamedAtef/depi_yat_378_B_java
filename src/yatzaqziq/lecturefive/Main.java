package yatzaqziq.lecturefive;

public class Main {
    public static void main(String[] args) {
// write your code here

//        Vehicle vehicle = new Vehicle(0, "asdasd");
//        Vehicle vehicle1 = new Vehicle("Mercedes", "C300", "Car");
        Vehicle vehicle = new Vehicle();

        new Vehicle("Mercedes", "C300", "Car");

        vehicle.setData("Mercedes", "C300", "#EEEEEE", "Car", true, 4);
        System.out.println("Hello");

        System.out.println(vehicle.returnData());

        vehicle.returnData(0, "");

        vehicle.returnData("name", 5);
    }
}
