public class BubbleSort {
    public static void PrintBubble_Sort(int num[]){
        for(int turn=0;turn<num.length;turn++){
            for(int j=0;j<num.length-1;j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
        public static void printarr(int num[]){
            for(int i=0;i<num.length;i++){
                System.out.print(num[i] + " ");

            }
            System.out.println();
        }

    
    public static void main(String[] args){
        int num[] = {2,1,3,5,4};
        PrintBubble_Sort(num);
        printarr(num);
    }

    
}


// it is giving the worong when i solved it afterwarda do it propery

