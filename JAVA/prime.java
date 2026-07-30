import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 2){
            System.out.println("is a prime");
        }
        else{

        boolean isPrime=true;
        for(int i=2;i<=num-1;i++){
            if(num% i==0){
                isPrime = false;
            }
              }
              if(isPrime == true){
                System.out.println("is prime number");
              }
              else{
                System.out.println("not a prime number");
              }
        }
    }
    
}
