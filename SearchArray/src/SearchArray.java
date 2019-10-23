
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String[] students = {"vu nhom", "nga ngo", "luyen thuyen", "hung dam", "manh duc", "thanh bi", "dung khung",
                "lam tac", "long shen", "tuan tu"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Name You Wanna Search For: ");
        String input = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input)) {
                flag = true;
                System.out.println("Position of the student " + input + " in the list is: " + (i + 1));
            }
        }
        if (!flag) {
            System.out.println("Not found " + input + " in the list.");
        }
    }
}