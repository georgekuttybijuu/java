import java.util.ArrayList;
import java.util.List;

class MultiplicationTableGenerator extends Thread {
    private int number;

    public MultiplicationTableGenerator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
    	System.out.println("Georgekutty Biju\n22MCA027\nOOPS LAB\n20MCA132\nDate:20-06-2023\n");
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

class PrimeNumberGenerator extends Thread {
    private int count;

    public PrimeNumberGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " prime numbers:");
        List<Integer> primes = new ArrayList<>();
        int number = 2;
        while (primes.size() < count) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }
        for (int prime : primes) {
            System.out.println(prime);
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

public class multiof5 {
    public static void main(String[] args) {
        MultiplicationTableGenerator multiplicationTableGenerator = new MultiplicationTableGenerator(5);
        PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator(10);

        multiplicationTableGenerator.start();
        primeNumberGenerator.start();
    }
}

