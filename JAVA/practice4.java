//Check whether a year is leap year.
//Check whether a number is divisible by 5.
import java.util.Scanner;
public class practice4 {
    public static void main(String[] args){
        /*int year = 2028;
        if((year % 4==0 && year %100 != 0 ) || (year % 400 ==0)){
            System.out.println(year + ": is a leap year");
        }
        else{
            System.out.println(year +": is not a leap year");
        }
            
        // Taking input from the use[Scanner class]
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int year = sc.nextInt();
        if((year %4==0 && year % 100 !=0) || (year % 400 ==0)){
            System.out.println(year + ":is a leap year");
        }
        else{
            System.out.println(year + ": is not a leap year");
        }
            */
           //2.NUmber is divisble a 5
           Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
           int num1 = sc.nextInt();
          // if(num % 5==0){
            //System.out.println(num +": is divible");
           //}
           //else{
            //System.out.println(num +":is not divible");
           //}
           if(num >=num1){
            System.out.println(num +": is greater than num1");
           }
           else{
            System.out.println(num1+":is greater than num");
           }
        
    }
    
}
