public class database {
    public static void main(String[] args) {
        // 3x2 array (3 rows, 2 columns)
        String[][] table = {
            {"101", "Alice"},
            {"102", "Bob"},
            {"103", "Charlie"}
        };

        // Printing the table
        System.out.println("ID\tName");
        for (int i = 0; i < table.length; i++) {       // rows
            for (int j = 0; j < table[i].length; j++) { // columns
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
