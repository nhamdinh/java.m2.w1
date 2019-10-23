import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long rate = 23000;
        System.out.print("Enter USD amount to convert to VND: ");
        long input = sc.nextLong();
        System.out.println(input+" USD = "+input*rate+" VND");
    }
}