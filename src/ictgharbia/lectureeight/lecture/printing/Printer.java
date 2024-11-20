package ictgharbia.lectureeight.lecture.printing;

abstract public class Printer {
    public int pages;
    public int inckPercent;
    public void startPrinting(){
        // concrete method
    }

    abstract public void scanPaper(); // abstract

    abstract public void checkInckExistence();

    abstract public void measureInckPercentage();
    abstract public void checkOrdersQueue();
    abstract public int returnOrderQueueSize();
    abstract public void move();
}
