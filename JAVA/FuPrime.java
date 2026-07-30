public class FuPrime {
    public static boolean isPrime(int n){
        //boolean isPrime = true;
        for(int i=2;i<n-1;i++){
            if(n %i == 0){ // here it is comp,etely dividing
               // isPrime = false;
               //
               // break;
               return false;
            }
        }
        return true;
    }

    //optimed prime numbers finding
    public static boolean isPrime1(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }

    // Prime in the Range 

    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
       // System.out.println(isPrime(11));
       primeRange(10);
    }
    
}
