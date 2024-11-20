package ictgharbia.lectureeight.lecture.listeners.printing.drawers;

import ictgharbia.lectureeight.lecture.listeners.printing.drawers.listeners.IAFour;
import ictgharbia.lectureeight.lecture.listeners.printing.scan.Scanner;

public class AFourDrawer extends Drawers implements IAFour {

    IAFour isAFour;

    @Override
    public void printableAFourDocument() {
        System.out.println("Printing A4 Document");
    }

    public AFourDrawer(){}

    public AFourDrawer(IAFour f){
        this.isAFour = f;
    }

    public boolean isA4Paper(){
        if (isAFour instanceof IAFour ){
            return true;
        }else {
            return false;
        }
    }

    public void callingScanner(){
        Scanner scanner = new Scanner();
        scanner.scan();
    }
}
