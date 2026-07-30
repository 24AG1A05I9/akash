import java.util.*;
public class PairInArr {
   /*  public static void Pairs_In_Array(int nums[]){
        for(int i=0;i<nums.length;i++){
            int current = nums[i] ; // 2,4,6,8,10;
            for(int j= i+1;j<nums.length;j++){
                System.out.print("(" + current + " ," + nums[j] + ")" + " " );
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int nums[] = { 2,4,6,8,10};
        Pairs_In_Array(nums);

    }
        */
       public static void main(String[] args){
        int nums[] = {2,4,6,8,10};
        for(int i=0;i<nums.length;i++){
            int curre= nums[i];
        
        for(int j=i+1;j<nums.length;j++){
            System.out.print("(" + curre + ","+ nums[j] + " )" + " ");
        }
        System.out.println();
       }
    }
    
}
