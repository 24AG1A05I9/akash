import java.util.*;
public class FunctionProduct{
	public static int product(int a,int b){
		int product = a * b;
		return product;
	}
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
		//int a =sc.nextInt();
		//int b = sc.nextInt();
		int a=5;
		int b=4;
		int product = product(a,b);
		System.out.println("the product of a & b is = " + product);
		product = product(12,2);
		System.out.println(product);
	}
}