package yatzaqziq.lectureeight.lecture;

public class Cat extends Animal{
    public Cat(int legs) {
        super(legs);
    }

    @Override
    public void eat(){
        System.out.println("Overriding abstract eat method");
    }

    public void sleep(){
        System.out.println("Overriding abstract sleep method");
    }

    // abstraction
    // abstract class vs interface
}
