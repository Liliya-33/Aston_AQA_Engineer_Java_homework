package org.example.lesson10_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.setFillColor("red");
        circle.setBorderColor("black");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.setFillColor("green");
        rectangle.setBorderColor("blue");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        triangle.setFillColor("yellow");
        triangle.setBorderColor("purple");
        triangle.printCharacteristics();
    }
}

