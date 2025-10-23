import java.util.*;
class HalfPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = sc.nextInt();

		//for the outer loop counting the lines only
		for(int i=1;i<=n;i++){

			 //for(inner loop checking the number of line to print)
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}