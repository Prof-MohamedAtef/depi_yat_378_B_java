package yatzaqziq.lectureseven.test;

public class Lion extends Animal{
    String meat;
    public Lion(int legs, String meat) {
        this.legs = legs;
        this.meat = meat;
    }

    @Override
    public void eat() {
        System.out.println("Lion eat: " + this.meat);
    }

    @Override
    public void sleep() {

    }
}
