package yatzaqziq.lectureeight.lecture;

import yatzaqziq.lectureeight.lecture.abstractmember.FourLegsAnimal;
import yatzaqziq.lectureeight.lecture.listener.machine.closing.sheets.CloseSheet;
import yatzaqziq.lectureeight.lecture.listener.machine.inc.Incking;
import yatzaqziq.lectureeight.lecture.listener.machine.open.drawers.OpenDrawer;
import yatzaqziq.lectureeight.lecture.listener.machine.open.drawers.OpenableDrawersI;
import yatzaqziq.lectureseven.lecture.animal.Animal;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(4);
//        animal.run();
//
//        animal.

        Cat cat = new Cat(4);
        cat.eat();
        cat.sleep();

//        cat.


//        Scanning scanning = new Scanning();
//        scanning.

        Incking incking = new Incking();
        incking.fillInck();
        incking.measureInckPercentage();

        CloseSheet closeSheet = new CloseSheet();
        closeSheet.saveSheet();
        closeSheet.closeSheets();
        closeSheet.getUserResponse(true);

        OpenDrawer openingDrawers = new OpenDrawer();
        openingDrawers.openAFourDrawer();
//        openingDrawers.

        OpenableDrawersI.openBFiveDrawer();

        //anonymous inner-class
//        FourLegsAnimal animal = new FourLegsAnimal() {
//            @Override
//            public void run() {
//
//            }
//        };


        FourLegsAnimal animal = new FourLegsAnimal("Horse") {
            @Override
            public void run() {
                System.out.println("Animal is running");
            }
        };

        animal.run();
    }
}
