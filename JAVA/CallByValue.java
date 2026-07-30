public class CallByValue {
    public static void swap(int a ,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a : " + a);
        System.out.println("b : "+ b);

    }
    //product of a and b
    public static int multiply(int a ,int b){
        int product = a * b;
        return product;
    }
    
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);
        System.out.println("a *b :"+prod);
    }
    
}
//Note :
// Java accepts only call by value due the copy of values are swap 
// Call by references is accepted in the c++ due to The original values can by there to give output
//product of two number 