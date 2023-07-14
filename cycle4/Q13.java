import java.util.PriorityQueue;
import java.util.Scanner;

public class Q13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
         System.out.println("Georgekutty Biju");
   System.out.println("22MCA027");
   System.out.println("27 June 2023");
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }
        System.out.println("Queue elements:");   
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        scanner.close();
    }
}

