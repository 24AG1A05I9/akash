import java.util.*;
/*class CharacPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = sc.nextInt();
		char ch = 'A';

		//outer loop for  lines
		for(int i=1;i<=n;i++){

			//inner loop for number of lines
			for(int j=1;j<=i;j++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
*/


class CharacPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		char ch = 'A';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch + " ");
			}
			ch++;
		}
		System.out.println();
	}
}



