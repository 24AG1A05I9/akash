import java.util.*;
public class Loops {
    public static void main(String[] args){
    /*1.WHILE LOOP */
        /*int counter = 0;
        while(counter <=10){
            System.out.println("AKASH");
            counter++;
        }
        System.out.println("PRINTED AKASH 11 TIMES");
        


        /*PRINTS NUMBERS FROM 1 TO 10 
        int num=1;
        while (num <=10) {
            System.out.println(num);
            num++;
            
        }
        */

        /*PRINT NUMBERS FROM 1 TO N */
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter =1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
            
        }

    }

    
}
