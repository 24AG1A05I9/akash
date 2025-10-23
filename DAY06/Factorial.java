import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		int fact = 1;
		System.out.println("Enter any postive number:");
		num = sc.nextInt();
		for(int i=1;i<=num;i++){
			fact =i*fact;

		}
		System.out.println(fact);

	}
}
