import java.util.Scanner;

public class simpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                for(int i = 6; i >0;i--){
                    System.out.println();
                    for(int j = i; j>0;j--){
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                for(int i = 0; i<6;i++){
                    System.out.println();
                    for (int j = 0; j<6;j++){
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for(int i =0; i<3;i++){
                    System.out.println();
                    for (int j = 0; j<6;j++){
                        System.out.print("*");
                    }
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
                break;
        }

    }
}