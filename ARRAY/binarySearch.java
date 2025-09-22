import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int numbers[]={1,2,3,565,8,76,5,99};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int key=76;
        int index=Arrays.binarySearch(numbers,key);
        if(index>=0){
            System.out.println(key + " "+index);
        }else{
            System.out.println("not found");
        }
    }
    
}
