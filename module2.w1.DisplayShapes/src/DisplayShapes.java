public class DisplayShapes {
    public static void main(String[] args) {
        System.out.println("Rectangle: ");
        DrawRectangle();
        System.out.println("90 Degree Triangle Top Down: ");
        Draw90DegreeTriangleTopDown();
        System.out.println("90 Degree Triangle Bottom Up: ");c
        Draw90DegreeTriangleBotUp();
        System.out.println("IsoscelesTriangle: ");
        DrawIsoscelesTriangle();
    }

    private static void DrawRectangle(){
        for (int i =0; i<3;i++){
            System.out.println();
            for (int j = 0; j <7;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    private static void Draw90DegreeTriangleTopDown(){
        for(int i = 0; i<5;i++){
            System.out.println();
            for (int j = 0; j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    private static void Draw90DegreeTriangleBotUp(){
        for(int i = 5; i>=0;i--){
            System.out.println();
            for (int j = i; j>0;j--){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    private static void DrawIsoscelesTriangle(){
        for (int i = 0 ; i< 7;i=i+2){
            System.out.println();
            for(int j = 0; j <7-i; j=j+2){
                System.out.print(" ");
            }
            for( int j = 0; j<=i;j++){
                System.out.print("*");
            }
        }
    }
}