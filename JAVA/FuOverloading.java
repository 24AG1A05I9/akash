public class FuOverloading {
    //Function Overloading --->multiple functions with the same name but different parameters
    
    //caluclate the sum of 2 values
    public static int sum(int a ,int b){
        return a+b;

    }
    public static int sum(int a,int b,int c){
        return a+b+c;

    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(sum(5, 6));
        System.out.println(sum(2.4f, 2.6f));
        System.out.println(sum(4, 6, 7));
    }
    
}
