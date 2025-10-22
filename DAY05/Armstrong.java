import java.io.*;
import java.util.*;

class Armstrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =n;
        int r,sum =0;
        while(n>0){
            r = n %10;
            n = n/10;
            sum = sum + r*r*r;
        }
        if(temp==sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
