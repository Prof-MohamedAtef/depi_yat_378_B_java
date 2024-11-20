package ictgharbia.lectureeight.lecture.listeners.printing.scan;

import ictgharbia.lectureeight.lecture.listeners.printing.Printer;
import ictgharbia.lectureeight.lecture.listeners.printing.listeners.IScan;

public class Scanner implements IScan {
    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}
