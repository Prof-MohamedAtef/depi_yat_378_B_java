package yatzaqziq.lectureeight.test;

import yatzaqziq.lectureeight.lecture.Animal;
import yatzaqziq.lectureeight.lecture.Cat;
import yatzaqziq.lectureeight.test.abstractmemebers.clothing.Clothing;
import yatzaqziq.lectureeight.test.abstractmemebers.clothing.Returnable;
import yatzaqziq.lectureeight.test.abstractmemebers.clothing.Shirt;
import yatzaqziq.lectureeight.test.abstractmemebers.clothing.Trousers;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("");
        car.move();

        Shirt shirt = new Shirt();
        shirt.doReturn();

        Clothing c1 = new Trousers();
//        c1.
        Trousers t1 = new Trousers();
//        t1.
        Returnable r1 = new Shirt();
//        r1.
        Returnable trousersReturn = new Trousers();
//        r2.
//        ((Trousers) r1).
//        ((Trousers)r2).
        if (trousersReturn instanceof Trousers){
//            ((Trousers)trousersReturn).
        }


//        Animal animal = new Animal(4);
//        animal.

//        Cat cat = new Cat(4);
//        cat.
    }
}
