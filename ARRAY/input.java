import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int numbers[]= new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
