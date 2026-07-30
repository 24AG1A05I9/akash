// Trianble pattern 

import java.util.*;
public class pattern1 {
    public static void main(String[] args){
        //outer loop for lines
        /*int n =4;
        for(int i=1;i<=n;i++){
            //inner loop for number of times to print by using another varibale
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */
           // Taking input from the user by scanner class
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
           }
    }
    
}
