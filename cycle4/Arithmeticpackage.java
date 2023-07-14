import arithmetic.*;
import java.util.Scanner;

public class Arithmeticpackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Georgekutty Biju\n22MCA027\nOOPS LAB\n20MCA132\nDate:20-06-2023\n");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        Arithmetic addition = new Addition();
        System.out.println("Addition: " + addition.calculate(num1, num2));

        Arithmetic subtraction = new Subtraction();
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));

        Arithmetic multiplication = new Multiplication();
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));

        Arithmetic division = new Division();
        System.out.println("Division: " + division.calculate(num1, num2));
    }
}

