import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int erases = sc.nextInt();
        int totalcost = pencil + pen + erases;
        System.out.println("the total cost of this three items:" + totalcost);

        // adding the 18 % taxi to it then return
        float newTotal = totalcost + (0.18f * totalcost);
        System.out.println(newTotal);
    }
    
}
