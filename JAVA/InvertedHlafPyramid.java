public class InvertedHlafPyramid{
    public static void Inverted_Half_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_num_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
    public static void Inverted_Half_reactangle_star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        //Inverted_Half_Pyramid(5);
        //inverted_half_num_pyramid(5);
        Inverted_Half_reactangle_star(7);

    }
}