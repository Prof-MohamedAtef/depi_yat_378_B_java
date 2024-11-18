package yatzaqziq.lectureeight.lecture;

abstract public class Animal {
    public int legs;

    public Animal(int legs){
        this.legs = legs;
        System.out.println(legs);
    }

    // concrete method
    void run(){
        System.out.println("concrete method having implementation");
    }

    abstract public void eat();

    abstract public void sleep();

}