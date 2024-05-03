package java_basic.oop.ex;

public class Rectangle {
    int width;
    int height;

    void initRectangle() {
        width = 10;
        height = 15;
    }

    void printArea() {
        System.out.println("Area = " + width * height);
    }

    void printPerimeter() {
        System.out.println("Perimeter = " + (width * 2 + height * 2));
    }

    void printIsSquare() {
        System.out.println("Is square = " + (width == height));
    }
}
