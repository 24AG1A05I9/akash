public class BinaryToDecimal{
    public static void bintodec(int biNum){
        int myNum = biNum;
        int pow =0;
        int decNum = 0;
        while(biNum >0){
            int lastDigit = biNum %10;
            decNum = decNum + (lastDigit *(int)Math.pow(2,pow));
            pow++;
            biNum = biNum /10;
        }
        System.out.println("decimal of " + myNum + "=" + decNum);

    }
    public static void main(String[] args){
        bintodec(100);

    }
}
