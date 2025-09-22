import java.util.*;

public class linearSearch { // Class starts here
    public static void main(String args[]) { // Main method starts here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int search = sc.nextInt();
        
        // FIX 1 & 2: Use 'boolean' and initialize to 'false'
        boolean found = false; 

        for (int j = 0; j < arr.length; j++) {
            if (search == arr[j]) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    } // Main method ends here

} // FIX 3: Added the missing closing bracket for the class