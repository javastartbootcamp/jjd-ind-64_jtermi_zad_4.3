package pl.javastart.task;

import static java.lang.Math.PI;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (PI * Math.pow(this.radius, 2));
    }
}
