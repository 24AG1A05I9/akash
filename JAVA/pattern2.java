import java.util.*;
public class pattern2 {
    public static void main(String[] args){
        // SQUARE PATTERN
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
            */
           //taking input from the user
           Scanner sc =new Scanner(System.in);
           int n = sc.nextInt();
           for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
           }

    }
    
}
