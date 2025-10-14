//1.print the akash 100 times by using the while loop
//2.print the 10 time using the while loop;


/*public class first {
    public static void main(String[] args) {
        int c =0;
       /*  while(c<100){
            System.out.println("akash");
            c++;
        }
        
        while(c<10){
            System.out.println("akash print 10 times");
        }
    }
    
}
    




// PRINT THE numbers frm 1 to 10 using the while loop;

//public class first{
    public static void main(String[] args){
        int flag =1;
        while(flag<=10){
            System.out.print(flag + " ");
            flag++;
        }
    }
}
    */


//3.print the numbers from 1 to n(take n as user input from scanner objest)
import java.util.*;
public class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while(count<=n){
            System.out.println(count + " ");
            count++;
        }
    }

}
