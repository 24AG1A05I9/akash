public class SolidRhombus {
    public static void Solid_Rhombus(int n){
        //for outer loop
        for(int i=1;i<=n;i++){
            //spacess
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //HOLLOW RHOMBUS
    public static void Hallow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            //spacess
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow rectangle for stars
            for(int j=1;j<=n;j++){
                if( i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        //Solid_Rhombus(5);
        Hallow_Rhombus(5);
    }
    
}
