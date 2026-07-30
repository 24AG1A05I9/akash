import java.util.*;
public class Incometax {
    public static void main(String[] args) {
        int income = 25000;
        int tax;
        if(income <50000)
            tax = 0;
        else if(income >=  50000 && income <= 100000)
            tax =(int) (0.2 *income);
        else{
            tax =(int) (0.3 *income);
        }
        System.out.println("your tax is :" + tax);
    }
    
}
