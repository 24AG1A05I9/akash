import java.util.*;
class Pattern2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		System.out.println("here is ur pattern2");
		//printing the upper triangle
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				//System.out.print(i+" ");
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		//printitng the lower triangle
		for(int i=n-1;i>=0;i--){
			for(int j=1;j<=i;j++){
				//System.out.print(i+" ");
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
