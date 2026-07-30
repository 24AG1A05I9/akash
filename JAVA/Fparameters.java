import java.util.*;
public class Fparameters {

    public static int FunctionParameters(int num1,int num2){
        
        int sum =num1 + num2;
        //System.out.println("sum is " + sum); 
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = FunctionParameters(a,b);
        System.out.println("sum is " + sum); 

    }
    
}
