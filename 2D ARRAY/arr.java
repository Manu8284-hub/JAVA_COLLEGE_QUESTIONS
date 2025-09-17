public class arr{
    public static void main(String args[]){
        int Arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12},
        };
        // System.err.println(Arr.length);
        for(int i=0; i<Arr.length; i++){
            for(int j=0; j<Arr[i].length; j++){
                System.out.print(Arr[i][j] + " " );
            }
            System.out.println();
        }
    }
}