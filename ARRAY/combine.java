import java.util.*;

class Combine {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int choice;
        do {
            System.out.println("1. Insert  2. Delete  3. End");
            choice = sc.nextInt();

            if (choice == 1) {
                int pos = sc.nextInt();
                int newnumber = sc.nextInt();

                numbers[pos] = newnumber;

                for (int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
            } else if (choice == 2) {
                int pos = sc.nextInt();

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[pos] == numbers[i]) {
                        continue;
                    } else {
                        System.out.println(numbers[i]);
                    }
                }
            } else if (choice == 3) {
                System.out.println("program ended...");
            } else {
                System.out.println("invalid input....");
            }

        } while (choice != 3);
    }
}
