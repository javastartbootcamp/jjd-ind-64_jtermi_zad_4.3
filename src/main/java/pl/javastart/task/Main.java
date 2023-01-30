package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(2, 3, 4);

        double squareArea = square.calculateArea();
        System.out.printf("Pole kwadratu wynosi: %.2f\n", squareArea);
        double rectPerimeter = rectangle.calculatePerimeter();
        System.out.printf("Obwód prostokąta wynosi: %.0f\n", rectPerimeter);
        double circleArea = circle.calculateArea();
        System.out.printf("Pole koła wynosi: %.2f\n", circleArea);
        double trianglePerimeter = triangle.calculatePerimeter();
        System.out.printf("Obwód trójkąta wynosi: %.2f\n", trianglePerimeter);
    }
}
