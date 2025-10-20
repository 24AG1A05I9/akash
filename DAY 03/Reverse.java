import java.util.*;
//print the reverse of a number
class Reverse{
	public static void main(String[] args){
		/* int n=98765;
		while(n>0){
			int lastDigit = n % 10;               //it will prints the lastdigits of a number

			System.out.print(lastDigit);
			n = n /10;                         // remove the last digit

		}
		System.out.println();

		
    




    // reverse of a given number
		Scanner sc = new Scanner(System.in);                //taking input from the user
		int n = sc.nextInt();
		while(n>0){
			int lastDigit = n % 10;
			n = n /10;
			System.out.print(lastDigit);
		}
		System.out.println();
		




		//REVERSE OF A GIVEN NUMBER
		int rev =0;
		int n =123456789;
		while(n>0){
			int lastDigit = n %10;
			rev = (rev *10) + lastDigit;
			n = n/10;
		}
		System.out.println(rev);

		

    // reverse a given number by asking input from the user

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev= 0;
		while(n>0){
			int lastDigit = n % 10;             //prints the last digit of a number
			n = n /10;                          // removers the last digit of an number;
			rev = (rev *10) + lastDigit;
		}
		System.out.println(rev);
		*/


		//using the do while loop print the last digit of a numner;

		int n = 8765;
		do{
			int lastDigit = n %10;
			n = n /10;
			System.out.println(lastDigit);
		}
		while(n>0);






	}
}
