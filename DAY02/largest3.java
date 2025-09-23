import java.util.*;
class largest3{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		int a=3,b=5,c=1;
		if(a>=b && a>=c){
			System.out.println("the largest is:" + a);
		}
		else if(b>=c && b>=a){
			System.out.println("the largest is:" + b);
		}
		else{
			System.out.println("hte largest is:" + c);
		}
	}
}