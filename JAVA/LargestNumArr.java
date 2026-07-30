import java.util.*;
public class LargestNumArr {
    public static int getLargest(int numbers[]){
       // int numbers[] = { 1,4,5,6,3,14,43,2,7,8};
        int Largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(Largest < numbers[i]){
                Largest = numbers[i];
            }
        }
        return Largest;

    }
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,8,9,23,11,12};
        System.out.println(getLargest(numbers));

    }
    
}
