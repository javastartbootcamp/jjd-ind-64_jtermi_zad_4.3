package pl.javastart.task;

import static java.lang.Math.*;

public class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return (pow(square.side, 2));
    }

    double calculateCircleArea(Circle circle) {
        return (PI * Math.pow(circle.radius, 2));
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return (triangle.sideA + triangle.sideB + triangle.sideC);
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return ((2 * rectangle.sideA) + (2 * rectangle.sideB));
    }
}
