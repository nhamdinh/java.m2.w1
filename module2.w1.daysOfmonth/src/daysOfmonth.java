
import java.util.Scanner;

public class daysOfmonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int input = sc.nextInt();
        String output = "";
        switch (input) {
            case 2:
                output = "The month " + input + " has 28 or 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                output = "The month " + input + " has 31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                output = "The month " + input + " has 30 days";
                break;

        }
        if (output != "") {
            System.out.println(output);
        } else {
            System.out.println("Invalid Input!");
        }
    }
}