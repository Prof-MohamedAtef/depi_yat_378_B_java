package ictgharbia.lectureeight.lecture.listeners.printing.drawers;

import ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners.IAFour;

public class AFourDrawer extends Drawers implements IAFour {
    @Override
    public void printableAFourDocument() {
        System.out.println("Printing A4 Document");
    }
}
