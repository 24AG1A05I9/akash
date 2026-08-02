//Java Program to Check Whether a Character is Vowel or Consonant
import java.util.*;
public class vowelcon {
    public static void main(String[] args){
        /*char ch = 'A';
        if(ch=='A' || ch =='E' || ch =='I' ||ch =='O' || ch == 'U' ||ch == 'a' || ch =='e' || ch=='i' || ch =='o' ||ch=='u'){
         System.out.println(ch + ": vowel") ;  
        }
        else{
            System.out.println(ch +": constant");
        }
            */

        //taking input from the user
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch =='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch =='A'||ch == 'E' || ch=='I' || ch=='O'|| ch =='U'){
            System.out.println(ch + ": vowel");
        }
        else{
            System.out.println(ch +": is constant");
        }
        sc.close();
        
    }
    
}
