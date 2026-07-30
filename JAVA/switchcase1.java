import java.util.*;
public class switchcase1 {
    public static void main(String[] args){
        /*int a = 5;
        int b= 1;
        char op = '+';
        */
       //user input
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a value : ");
       int a = sc.nextInt();
       System.out.println("enter b value : ");
       int b =sc.nextInt();
       char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("add " + (a+b));
                break;
            case '-':
                System.out.println("sub"+ (a-b));
                break;
            case '*':
                System.out.println("multiple" + (a*b));
                break;
            case '/':
                System.out.println("divide" + (a/b));
                break;
            case '%':
                System.out.println("modulus"+(a%b));
                break;
            default:
                System.out.println("not an operator");
        }
    }
    
}
