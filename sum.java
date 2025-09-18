import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        // CODE TO CALUCTE THE SUM OF TWO NUMBERS
        // when the input takes from the user then we can use the Scanner and aslo we have to create a package with the Sccanner 
       /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum:" +( a+b));
        

        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        int pdt = a * b;
        System.out.println("the product of two terms:" + pdt);

        //int a = 4;
        //int b=4;
        //int sum = a+b;
        //System.out.println(sum);
    }
}
    
    

