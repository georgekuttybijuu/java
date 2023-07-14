import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q18{
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Georgekutty Biju");
   System.out.println("22MCA027");
   System.out.println("27 June 2023");
        System.out.println("Enter the elements (key-value pairs):");
        for (int i = 0; i < numElements; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine(); 
            hashMap.put(key, value);
        }
        System.out.println("Initial HashMap:");
        printMap(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Final TreeMap:");
        printMap(treeMap);

        scanner.close();
    }
    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

