import graphics.*;
import java.util.Scanner;

public class Graphicspackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Georgekutty Biju\n22MCA027\nOOPS LAB\n20MCA132\nDate:20-05-2023\n");
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.print("Enter the base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double triangleHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triangleBase, triangleHeight);
        System.out.println("Triangle Area: " + triangle.calculateArea());

        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);
        System.out.println("Square Area: " + square.calculateArea());

        System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.calculateArea());

        scanner.close();
    }
}

