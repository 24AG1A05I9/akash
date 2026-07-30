import java.util.*;
public class BinarySearch {
    public static int binarySearchs(int nums[] ,int key){
        int start =0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            // if it is found 
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int nums[] = {10,20,30,40,50,60};
        int key = 60;
        System.out.println(binarySearchs(nums,key));
    }
    
}
