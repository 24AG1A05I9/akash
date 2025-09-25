import java.util.*;
class Q33{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("the year is a leap year or non-leap year");
		int year = sc.nextInt();
		if(year % 4 ==0 || year % 400==0 && year %100 != 0){
			System.out.println("year is a leap ");
		}else{
			System.out.println("year is not leap");
		}
	}
}