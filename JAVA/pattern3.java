import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        //Inverted star pattern
        /*for(int i=1;i<=4;i++){
            //inner loop for number of time
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
            */

        //taking input from the user
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for outer loop no.of lines
        for(int i=1;i<=n;i++){
            //inner loop for number of times
            for(int j=1;j<=n-i+1;j++){
                //print the output of it
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    
}
