package yatzaqziq.lecturesix.test;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class Vehicle {
    String brand;
    int wheels;
    LocalDate date;
    JapaneseDate japaneseDate;

    public Vehicle(){
        System.out.println("Vehicle Default Constructor");
    }

    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
        System.out.println("Vehicle Constructor: " + this.brand + ", " + this.wheels);
    }

    public void setMoveDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getMoveDate() {
        return date;
    }

    public JapaneseDate getJapaneseDate() {
        return japaneseDate;
    }

    public void setJapaneseDate(JapaneseDate japaneseDate) {
        this.japaneseDate = japaneseDate;
    }
}