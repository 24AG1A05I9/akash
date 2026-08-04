public class StringCharAt{
    public static void printcharacters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
    public static void main(String[] args){
        String str1 = "Akash";
        String str2 = "Lucky";
        String FullName = str1+ " " + str2;
        printcharacters(FullName);
    }
}