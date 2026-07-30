import java.util.*;
public class reversenum {
    public static void main(String[] args){
       /*  int n =10899;
        while (n >0) {
            int lastDigit = n %10;
            System.out.print(lastDigit);
            n = n/10;
            
        }
        System.out.println();
        */
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num >0){
            int lastDig = num %10;
            System.out.print(lastDig);
            num = num /10;
        }
        System.out.println();
        */

        /*REVERSE OF THE GIVEN NUMBER */
        int num = 10899;
        int reverse =0;
        while(num >0){
            int lastDig = num %10;
            reverse = (reverse *10) + lastDig;
            num = num/10;
        }
        System.out.print(reverse);
    }
    
}
