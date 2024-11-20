package ictgharbia.lectureeight.lecture.listeners.printing.drawers;

import ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners.IAThree;

public class AThreeDrawer extends Drawers implements IAThree {
    @Override
    public void printableAThreeDocument() {
        System.out.println("Printing A3 Paper");
    }
}
