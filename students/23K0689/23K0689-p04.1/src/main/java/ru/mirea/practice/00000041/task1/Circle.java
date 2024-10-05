package ru.mirea.practice.s23L0908.task1;


public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Тип фигуры: " + getType() + ", Радиус: " + radius + ", Площадь: " + getArea() + ", Периметр: " + getPerimeter();
    }
}
