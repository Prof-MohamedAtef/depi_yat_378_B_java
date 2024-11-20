package ictgharbia.lectureeight.lecture.listeners;

import ictgharbia.lectureeight.lecture.listeners.animal.Cat;
import ictgharbia.lectureeight.lecture.listeners.animal.Dog;
import ictgharbia.lectureeight.lecture.listeners.printing.Printer;
import ictgharbia.lectureeight.lecture.listeners.printing.drawers.AFourDrawer;
import ictgharbia.lectureeight.lecture.listeners.printing.drawers.AThreeDrawer;
import ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners.IAFour;
import ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners.IAThree;
import ictgharbia.lectureeight.lecture.listeners.printing.ink.InkCartridge;
import ictgharbia.lectureeight.lecture.listeners.printing.scan.Scanner;

/*
SOLID Principles
1. Single Responsibility
2. Open for extension but closed for modification
3. Liskuv Substitution
4. Interface Segregation Principle
5. Dependency Inversion
 */

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.defineDog();
        dog.parking();

        Cat cat = new Cat();
        cat.defineCat();
        System.out.println("Cat speed: " + cat.measureSpeed() + "km/hr");

        Printer printer = new Printer();
//        printer.

        Scanner scanner = new Scanner();
        scanner.scan();

        InkCartridge inkCartridge = new InkCartridge(80);
        inkCartridge.measureInc();
        inkCartridge.fillInc();
        inkCartridge.showReplacementMessage();
//        inkCartridge.


        AThreeDrawer a3drawer = new AThreeDrawer();
        a3drawer.openDrawer();
        a3drawer.closeDrawer();
        a3drawer.printableAThreeDocument();

        IAThree.callingScanner();

//        a3drawer.callingScanner();

//        System.out.println(a3drawer);


//        a3drawer.

        AFourDrawer a4Drawer = new AFourDrawer();
        a4Drawer.printableAFourDocument();
        System.out.println(a4Drawer);
//        a4Drawer.
        IAFour iaFour = new AFourDrawer();
//        iaFour.

        boolean isA4 = a4Drawer.isA4Paper();
        if (isA4) {
            a4Drawer.callingScanner();
        }else {
            System.out.println("Not A4 Paper...");
        }

        AFourDrawer a4DrawerTwo = new AFourDrawer(iaFour);
        isA4 = a4DrawerTwo.isA4Paper();

        if (isA4) {
            a4Drawer.callingScanner();
        }else {
            System.out.println("Not A4 Paper...");
        }
    }
}
