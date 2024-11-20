package ictgharbia.lectureeight.lecture.listeners.printing.drawers;

import ictgharbia.lectureeight.lecture.listeners.printing.Printer;
import ictgharbia.lectureeight.lecture.listeners.printing.listeners.IDrawer;

public class Drawers implements IDrawer {
    @Override
    public void detectPaperSize() {
        System.out.println("Detecting paper size");
    }

    @Override
    public void openDrawer() {
        System.out.println("Opening Drawer");
    }

    @Override
    public void closeDrawer() {
        System.out.println("Closing Drawer");
    }
}
