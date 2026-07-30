import java.util.*;
public class pattern4 {
    public static void main(String[] args){
        //half pyramid pattern
        //outer  loop --->LINES I=5
        for(int i=1;i<=5;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
