package pl.javastart.task;

public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculatePerimeter() {
        return ((2 * this.sideA) + (2 * this.sideB));
    }
}
