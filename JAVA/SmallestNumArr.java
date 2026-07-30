import java.util.*;
public class SmallestNumArr {
    /*public static  int getSmallestNum(int nums[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Smallest >nums[i]){
                Smallest = nums[i];
            }
        }
        return Smallest;

    }
    public static void main(String[] args){
        int nums[] = { 12,13,14,25,43,21,11};
        System.out.println(getSmallestNum(nums));
    }
        */

public static void main(String[] args){
    int nums[] = {1,2,3,4,44,5,6,7};
    int Largest = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(Largest < nums[i]){
            Largest = nums[i];
        }
        //System.out.println(Largest);
        
    }
    System.out.println(Largest);
}



    
}
