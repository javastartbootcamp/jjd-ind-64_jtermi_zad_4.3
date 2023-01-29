package pl.javastart.task;

import static java.lang.Math.PI;

public class Circle {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return (PI * Math.pow(this.radius, 2));
    }

}
