import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Georgekutty Biju\n22MCA027\nOOPS LAB\n20MCA132\nDate:20-06-2023\n");
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            try {
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();

                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers are not allowed.");
                }

                sum += num;
                count++;
            } catch (NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
                i--;  // Decrement i to repeat the current iteration
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of positive numbers: " + average);
        } else {
            System.out.println("No positive numbers entered.");
        }
    }
}

