import java.util.*;
public class typeconversion {            //type conversion or implcite or widering conversion are same meaning
    public static void main(String[] args){
        //int a = 8;                 //type conversion will happen from int to long
        //long b = a;

       // System.out.println(b);              // this will return b =8


       // long a = 23;
       // int b = a;                      // this type conversion is not possrible bcos lont to int is not possible their memory and storing byte are differrnt 
       // System.out.println(b);          //type conversion[byte  >  short > int >float > long > double]



      // Scanner sc = new Scanner(System.in);
       //int n= sc.nextFloat();            // this conversion is not possible bcos the float values cannot converted to the integer
       //System.out.println(n);


        Scanner sc = new Scanner(System.in);
       float n= sc.nextInt();            
       System.out.println(n);

    }
    
}
