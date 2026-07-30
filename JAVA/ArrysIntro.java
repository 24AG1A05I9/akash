import java.util.*;
public class ArrysIntro {
    public static void main(String[] args){
        int marks[] = new int[89];

        //int markss[] = {1,2,3,4,5}

        //String akash[] = {"apple" ,"akkashvani","tracher" }
        Scanner sc = new Scanner(System.in);
        //int sub = sc.nextInt();
        //or
        marks[0] = 99;//phys
        marks[1] = 98; //maths
        marks[2] = 97; //ch
        marks[3] = 96; //sports
        //ARRY LENGTH
        
        System.out.println("length of array : " + marks.length);


        System.out.println("phys : " + marks[0]);
        System.out.println("phys : " + marks[1]);
        System.out.println("phys : " + marks[2]);
        System.out.println("phys : " + marks[3]);

        //UPDATE THE ARRAYS VALUE
        System.out.println("UPDATE THE 2ND INDEX :-------");
        marks[1] = marks[1] + 4;
        System.out.println("maths :" + marks[1]);

        //PERCENTAGE OF A MARKS
        System.out.println("percetenge of a marks---------");
        int percetenge = (marks[0] + marks[1]+marks[2] + marks[3])/4;
        System.out.println("percentage :" + percetenge + "%");
    }
    
}
