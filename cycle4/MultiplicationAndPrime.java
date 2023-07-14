import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplicationTableGenerator extends Thread {
    private int number;

    public MultiplicationTableGenerator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

public class PrimeNumberGenerator extends Thread {
    private int count;

    public PrimeNumberGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " Prime Numbers:");
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < count) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class MultiplicationAndPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = scanner.nextInt();
        MultiplicationTableGenerator multiplicationTableGenerator = new MultiplicationTableGenerator(number);

        System.out.print("Enter the count of prime numbers to display: ");
        int count = scanner.nextInt();
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator(count);

        scanner.close();

        multiplicationTableGenerator.start();
        primeNumberGenerator.start();
    }
}
