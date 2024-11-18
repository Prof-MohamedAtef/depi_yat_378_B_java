package yatzaqziq.lectureeight.lecture.shape;

abstract public class Shape {
    int width, height;

    abstract public int calculateArea(int width);
    abstract public int calculatePerimeter(int width);

    abstract public void printResults(int width);
}
