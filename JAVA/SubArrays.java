public class SubArrays {
    public static void PrintSubArrays(int nums[]){
        int totalSubArrays =0;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            sum = i+sum;
            for(int j=i;j<nums.length;j++){
                int end = j;
                sum = j+sum;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k] + " ");
                    totalSubArrays++;
                }
                System.out.println();
                //System.out.println("sum" + sum);
            }
            System.out.println();
           // System.out.println(sum);
        }
        System.out.println("total subarrays" + totalSubArrays);

    }
    public static void main(String[] args){
        int nums[] = {2,4,6,8,10};
        PrintSubArrays(nums);
    }
    
}
