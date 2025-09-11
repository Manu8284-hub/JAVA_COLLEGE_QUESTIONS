import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("enter number greater then zero");
        }else{
            for(int i=1; i<=10; i++){
            System.out.println(n+"X"+i+"="+ n*i);
            }
        }    
    }
}
