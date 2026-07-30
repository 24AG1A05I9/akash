import java.util.Scanner;

public class Ffactorial {
    // finding the factorial

    public static int factorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        // binomial coffeirect formula ncr = n fact / r fact * (n-r) fact);
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int result = fact_n / (fact_r * fact_nmr);

        System.out.println("nCr = " + result);
    }
}