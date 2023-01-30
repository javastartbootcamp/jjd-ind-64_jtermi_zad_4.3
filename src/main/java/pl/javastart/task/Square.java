package pl.javastart.task;

import static java.lang.Math.pow;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return (pow(this.side, 2));
    }
}
