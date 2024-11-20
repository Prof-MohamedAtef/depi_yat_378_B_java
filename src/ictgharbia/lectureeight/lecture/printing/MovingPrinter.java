package ictgharbia.lectureeight.lecture.printing;

// problem : implementing multiple behaviors on the same class
// it's considered as a problem as it violate
// (SOLID Principles: Single Responsibility Principle)
// Use

public class MovingPrinter extends Printer {
    @Override
    public void scanPaper() {

    }

    @Override
    public void checkInckExistence() {

    }

    @Override
    public void measureInckPercentage() {

    }

    @Override
    public void checkOrdersQueue() {

    }

    @Override
    public int returnOrderQueueSize() {
        return 0;
    }

    @Override
    public void move() {

    }
}
