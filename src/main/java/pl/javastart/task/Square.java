package pl.javastart.task;

import static java.lang.Math.pow;

public class Square {

    double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return (pow(this.side, 2));
    }

}
