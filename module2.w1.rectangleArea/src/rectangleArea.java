import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width: ");
        float width = sc.nextFloat();
        System.out.println("Enter height: ");
        float height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}