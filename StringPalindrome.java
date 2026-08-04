public class StringPalindrome {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(n-1-i)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args){
        String str1 = "noon";
        System.out.println(isPalindrome(str1));

    }
    
}
