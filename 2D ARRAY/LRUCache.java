import java.util.Scanner;

public class LRUCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = 3; // cache size
        String[] cache = new String[capacity];
        int count = 0;

        while (true) {
            System.out.print("Enter a term (or 'exit' to quit): ");
            String term = sc.nextLine();

            if (term.equalsIgnoreCase("exit")) break;

            // Check if term already exists in cache
            int pos = -1;
            for (int i = 0; i < count; i++) {
                if (cache[i].equals(term)) {
                    pos = i;
                    break;
                }
            }

            // If found, shift left to remove old position
            if (pos != -1) {
                for (int i = pos; i < count - 1; i++) {
                    cache[i] = cache[i + 1];
                }
                count--;
            }

            // If cache is full, remove oldest (shift left)
            if (count == capacity) {
                for (int i = 0; i < capacity - 1; i++) {
                    cache[i] = cache[i + 1];
                }
                count--;
            }

            // Insert new term at the end (most recent)
            cache[count] = term;
            count++;

            // Display cache
            System.out.print("Cache: ");
            for (int i = 0; i < count; i++) {
                System.out.print(cache[i] + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
