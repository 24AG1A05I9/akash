public class MaxSubArray {
    public static void Max_Sub_Array(int nums[]){
        int curreSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
                int end = j;
                curreSum =0;
                for(int k=start;k<=end;k++){
                    curreSum += nums[k];
                }
                System.out.println(curreSum);
                if(maxSum <=curreSum){
                    maxSum=curreSum;
                }
                
            }
        }
        System.out.println("max sum "+ maxSum);

    }
    public static void main(String[] args){
        //int nums[] = { 1,-2,6,-1,2};
        int nums[] = {2,4,6,8,10};
        Max_Sub_Array(nums);

        

    }
    
}
