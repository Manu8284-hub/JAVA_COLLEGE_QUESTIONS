import java.util.*;
class delete{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[]= new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        int pos= sc.nextInt();
        //  int newnumber= sc.nextInt();
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[pos]== numbers[i]){
            continue;
        }else{
            System.out.println(numbers[i]);
            }
        
        }
    }
}