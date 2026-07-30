import java.util.*;
public class practice2 {
    public static void main(String[] args){
        //Check whether a number is even.
        //Check whether a number is odd
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 ==0){
            System.out.println("number is even ");
        }
        else{
            System.out.println("number is odd");
        }
            */
           //Check whether a person is eligible to vote
           //int age = 18;
           Scanner sc = new Scanner(System.in);
           int age = sc.nextInt();
           if(age >=18){
            System.out.println("eligible for vote");
           }
           else{
            System.out.println("not adult");
           }
    }
    
}
