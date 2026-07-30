import java.util.*;
import java.util.function.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("ENter b: ");
        int b = sc.nextInt();
        System.out.println("enter operator: ");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' :
                System.out.println("add : "+ (a+b));
                break;
            case '-':
                System.out.println("minues :"+(a-b));
                break;
            case '*':
                System.out.println("multiply : " + (a*b));
                break;
            case '/':
                System.out.println("divide : "+(a/b));
                break;
            case '%':
                System.out.println("remider :"+(a%b));
                break;
            default:
                System.out.println("no more Operator");
        }
    }
    
}
