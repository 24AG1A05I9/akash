import java.util.*;
public class Function1{


//2.Function with parameter passing 
    
    public static int CalculateSum(int num1,int num2){
        int sum = num1+num2;
       // System.out.println("sum is:" + sum);
        return sum;
    }





    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = CalculateSum(a,b);
       System.out.println("sum is: " + sum);

    }*/

    //3.function without paramater passing

    public static void CalculateSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is: "+ sum);
    }
    public static void main(String args[]){
        CalculateSum();
    }
}