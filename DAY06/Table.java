import java.util.*;
class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n = sc.nextInt();
		//using the for loop
		for(int i=1;i<=10;i++){
			System.out.println(n + "*"+ i + " = " + n*i);
		}

	}
}
