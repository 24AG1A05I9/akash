import java.io.*;
import java.util.*;

class PalindromeNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num != 0){
            rev = rev *10+num%10;
            num = num/10;
        }
        if(original == rev){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}