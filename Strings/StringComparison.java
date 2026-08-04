public class StringComparison {

    // string comparison uses the functions like  ---->   s1.equals(s3)
    public static void main(String[] args){
        String s1 = "Akash";
        String s2 = "Akash";
        String s3 = new String("Akash");


        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        }
        else {
            System.out.println("String are not equals");
        }
    }    
}
