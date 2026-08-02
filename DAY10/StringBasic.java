import java.util.*;
public class StringBasic {
    public static void main(String[] args){
        //representation of an string
        char arr[] = {'a','b'};
        String str = "akash";
        // or //
        String str1 = new String("akash");

        //input and output in strings
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();    // next Will take only one word 

        name = sc.nextLine(); // nextLine --- will take complete word with the spaces also 
        System.out.println(name);

        // String length
        String akash = "akash lucky";
        System.out.println(akash.length());

        // string Concatenation  ----> add two numbers or combinaning two words
        String fn = "sardar";
        String lastName = "Nayak";
        String fulname = (fn + " " + lastName+ " ");
        System.out.println(fulname + " this is it concetenation");
        System.out.println(fulname.length());
    }
    
}
