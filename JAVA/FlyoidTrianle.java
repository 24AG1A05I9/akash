public class FlyoidTrianle {
    public static void Flyoid_Triangle(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //print the counter values here
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }


    // ZERO ONE (0_1 TRIANGLE)
    public static void zero_one_triangle(int n){
        //outer loop for lines(rows)
        for(int i=1;i<=n;i++){
            //inner loop for (coloums)
            for(int j=1;j<=i;j++){
                if((i+j) % 2 ==0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //Flyoid_Triangle(5);
        zero_one_triangle(5);
    }
    
}
