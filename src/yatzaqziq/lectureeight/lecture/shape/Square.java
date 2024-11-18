package yatzaqziq.lectureeight.lecture.shape;

public class Square extends Shape {
    public int calculateArea(int width) {
        return width * width;
    }

    public int calculatePerimeter(int width) {
        return width * width;
    }

    public void printResults(int width) {
        System.out.println("Perimeter: " + calculatePerimeter(width));
        System.out.println("Area: " + calculateArea(width));
    }
}
