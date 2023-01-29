package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 3, 4);

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Pole kwadratu wynosi: " + shapeCalculator.calculateSquareArea(square));
        System.out.println("Obwód prostokąta wynosi: " + shapeCalculator.calculateRectPerimeter(rectangle));
        System.out.println("Pole koła wynosi: " + shapeCalculator.calculateCircleArea(circle));
        System.out.println("Obwód trójkąta wynosi: " + shapeCalculator.calculateTrianglePerimeter(triangle));
    }

}
