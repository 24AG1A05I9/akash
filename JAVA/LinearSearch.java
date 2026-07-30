/*public class LinearSearch {

    public static int Linear_Search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int index = Linear_Search(numbers, key);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}

*/



//without involoving the functions in the linear search
import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int index =-1;
        int key =7;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                index = i;
                //return i;
                break;
            }
        }
        if(index ==-1){
            System.out.println("key Not found at index");
        }else{
            System.out.println("key found at index : " + index);
        }
    }
   
}