public class FunBinomailCoeff {
    
    // Function to find factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to calculate nCr
    static int binomialCoeff(int n, int r) {
        if (r > n)
            return 0;
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println("Binomial Coefficient (nCr) = " + binomialCoeff(n, r));
    }
}
