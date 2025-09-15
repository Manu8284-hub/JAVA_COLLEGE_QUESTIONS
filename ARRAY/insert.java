import java.util.*;
class insert{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[]= new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        int pos= sc.nextInt();
        int newnumber= sc.nextInt();
        
        numbers[pos]= newnumber;
        
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
