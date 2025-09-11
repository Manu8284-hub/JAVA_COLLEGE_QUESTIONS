public class prime{
    public static void main(String[] args) {
        int n=5;
        Boolean isprime=true;
        for(int i=2; i<5; i++){
            if(n%i==0){
                isprime=false;
            }else{
                isprime=true;
            }
        }
        if(isprime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}