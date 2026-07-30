import java.util.*;
public class AtleatTwiceArray {
    
    //if the number will appers twice print is true if not print it false
    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean Atleast_One(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        //int nums[] = {1,2,3,1};
        //when the user is given the input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter the arrays elemt : ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Atleast_One(nums));
        sc.close();

    }
    
}



    

