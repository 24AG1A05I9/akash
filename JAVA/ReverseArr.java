import java.util.*;
public class ReverseArr {
    /*public static void Reverse_array(int nums[]){
        //reverse of given array == swapping the arrays time completicity id O(n),SP (1)
        int first=0,last = nums.length-1;
        while(first < last){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first ++;
            last--;
        }

    }
    public static void main(String[] args){
        int nums[] = { 10,20,30,40,50};
        Reverse_array(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }
        
       public static void main(String[] args){
        int nums[] = {10,20,50,20};
        int first =0,last = nums.length-1;
        while(first < last){
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;
            first++;
            last--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
       }
        */

       //BY USING THE INPUT FROM THE USER
       //SCANNER CLASS FROM THE USERINPUT

       public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[5];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            int first = 0,end = nums.length-1;
            while(first <end){
                int temp = nums[end];
                nums[end] = nums[first];
                nums[first] = temp;
                first++;
                end--;


            }
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i] + " ");
            }
            System.out.println();



       }
    
}
