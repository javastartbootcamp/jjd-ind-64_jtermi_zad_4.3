package pl.javastart.task;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double calculatePerimeter() {
        return (this.sideA + this.sideB + this.sideC);
    }
}
