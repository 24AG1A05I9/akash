public class PalindromicNumber {
    public static void Palindromic_Number(int n){
        //outer loop for line
        for(int i=1;i<=n;i++){
            //spacess
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //descending order
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //ascending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

        
        System.out.println();
        }
    }
    public static void main(String[] args){
        Palindromic_Number(6);
    }
    
    
}
