import java.util.Scanner;

public class SearchCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 5; // cache size (stores last 5 searches)
        String[] cache = new String[size];
        int index = 0;

        while (true) {
            System.out.print("Enter a search term (or 'exit' to quit): ");
            String term = sc.nextLine();

            if (term.equalsIgnoreCase("exit")) {
                break;
            }

            // Insert into cache (circular way)
            cache[index] = term;
            index = (index + 1) % size;

            // Display cache contents
            System.out.println("Recent Searches:");
            for (int i = 0; i < size; i++) {
                if (cache[i] != null) {
                    System.out.print(cache[i] + " | ");
                }
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
