
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String input = sc.nextLine();
        System.out.println("Ya Halo (Hello): " + input);
    }
}