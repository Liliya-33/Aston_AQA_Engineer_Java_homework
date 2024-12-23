package org.example.lesson10_2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    void setFillColor(String color);
    void setBorderColor(String color);

    default double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    default double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calculateTrianglePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }
}
