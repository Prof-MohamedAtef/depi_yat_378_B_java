package ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners;

import ictgharbia.lectureeight.lecture.listeners.printing.scan.Scanner;

public interface IAThree {
    static void callingScanner(){
        Scanner scanner = new Scanner();
        scanner.scan();
    }
    public void printableAThreeDocument();
}
