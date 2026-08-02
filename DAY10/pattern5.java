import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        //character pattern
        //outer loop for lines
        char ch ='A';
        for(int i=1;i<=5;i++){
            //inner loop for number of times
            for(int j=1;j<=i;j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println(" ");
        }
    }
    
}
