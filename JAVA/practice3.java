import java.util.*;
public class practice3 {
    public static void main(String[] args){
        //Check Whether a Character is Uppercase in Java
        /*char ch ='A';
        //System.out.println("Enter the character:");
        if(ch >='A' && ch <='Z'){
            System.out.println(ch  + " : the character is Upper case");
        }
        else{
            System.out.println(ch + "character nOT Upper case");
        }
            */
           //taking input from the user
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the character : ");
           char ch = sc.next().charAt(0);
           if(ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+": is a Upper case letter");
           }
           else{
            System.out.println(ch+ ": is not Upper case letter");
           }
    }
    
}
