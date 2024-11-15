package yatzaqziq.lectureseven.test;

public class Car extends Vehicle {
    String design;
    public Car(int wheels, String brand, String model){
        super(wheels, brand, model);
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);

    }

//    @Override
    public void printVehicle() {
//        super.printVehicle();
        System.out.println(brand + " " + model + " " + wheels + " " + design);
    }

    public void setDesign(String design) {
        this.design = design;
    }
}
