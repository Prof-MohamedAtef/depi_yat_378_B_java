package ictgharbia.lectureeight.lecture.listeners.printing.ink;

import ictgharbia.lectureeight.lecture.listeners.printing.Printer;
import ictgharbia.lectureeight.lecture.listeners.printing.listeners.IInkCartridge;

public class InkCartridge implements IInkCartridge {
    int incPercent = 0;

    public InkCartridge(){}

    public InkCartridge(int incPercent){
        this.incPercent = incPercent;
    }
    @Override
    public void measureInc() {
        System.out.println("Measure percentage is: " + this.incPercent);
    }

    @Override
    public void fillInc() {
        System.out.println("Cartridge needs Inc filling...");
    }

    @Override
    public void showReplacementMessage() {
        System.out.println("Maintenance of the cartridge is necessary...");
    }
}
