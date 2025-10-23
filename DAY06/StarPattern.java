//nested for loop printing the star pattern
//logic building is important
//this star pattern have the 3 condition:
//1.first loop checks for (   lines); outer loop
//2.2nd loop for number of lines (inner loop)
//3.what to print the final output




import java.util.*;
class StarPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n =sc.nextInt();
		/*for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		*/

		// here the logic is that when the outer loop for the lines  and inner loop for the number of lines
		//j = n-i+1

		for(int i=1;i<=n;i++){
			for(int j=1; j<=n-i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
