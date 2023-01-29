package pl.javastart.task;

public class Rectangle {

    double sideA;
    double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculatePerimeter() {
        return ((2 * this.sideA) + (2 * this.sideB));
    }

}
