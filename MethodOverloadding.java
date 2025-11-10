import java.util.*;
public class MethodOverloadding{           // method overloadding is states that:multilpy functions with the same class 
	                                        //and differnet paramater
	// sum to calu the 2 numbers
	public static int sum(int a,int b){
		int sum = a+b;
		return sum;
		//return a+b;
	}
	// sum to calu three numbers
	public static int sum1(int a,int b,int c){
		int sum1 = a+b+c;
		return sum1;
		

		//return a+b+c;

	}


	public static void main(String args[]){
		//System.out.println(sum(2,4));
		//System.out.println(sum(2,3,1));


		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c = sc.nextInt();
		int sum = sum(a,b);
		int sum1 =sum1(a,b,c);
		System.out.println(sum);
		System.out.println(sum1);
	}
}