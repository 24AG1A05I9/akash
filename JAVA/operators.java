import java.util.*;
// all type of operators like 1. Arthmatic 2. relational 3. logical operators 4.bitwis 5. assignment opertor
public class operators {
    public static void main(String[] args) {
        /* 
        int a =10;
        int b=5;
        System.out.println("add = " + (a+b));
        System.out.println("Subs  = "+ (a-b));
        System.out.println("multi = " +(a*b));
        System.out.println("divi = "+ (a/b));
        System.out.println("modulus = " + (a%b));

        


        // 2.UNRAY OPERATOR

        int a = 15;
       // int b =++a;
       int b = --a;
        System.out.println(a);
        System.out.println(b);

        

        // 3.RELATIONAL OPERTOR ---TRUE OR FALSE
        int a = 12;
        int b= 11;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        */

        //LOGICAL OPERATORS 
        //1.AND OPERATOR [WHEN BOTH STATEMENTS TRUE THEN ONLY TRUE REMAINING ALL FALSE]
        System.out.println((12>11) && (14>12));
        System.out.println((2>1) && (2>3));

        //2.OR OPERATOR[WHEN BOTH FALSE THEN ONLY FALSE REMAINING ALL ARE TRUE]
        System.out.println((1>2) || (2>3));
        System.out.println((12>13) || (13>12));
        System.out.println((2>3) || (4>5));

        //[! not] negation operator it changes true --->fale     and  false --->true
        System.out.println(!(3>2));

    }
    
}
