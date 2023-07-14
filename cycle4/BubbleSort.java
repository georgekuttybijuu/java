import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Georgekutty Biju");
        System.out.println("22MCA027");
        System.out.println("27 June 2023");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter 'A' for ascending order or 'D' for descending order: ");
        String order = scanner.next().toUpperCase();
        
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        if (order.equals("A")) {
            bubbleSortAscending(array);
            System.out.println("After sorting in ascending order: " + Arrays.toString(array));
        } else if (order.equals("D")) {
            bubbleSortDescending(array);
            System.out.println("After sorting in descending order: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D' for the order.");
        }
        
        scanner.close();
    }
    
    public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

