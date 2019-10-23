import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.EnterData();
        System.out.println("Your Rectangle: "+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}

class Rectangle {
    int height, width, perimeter, area;

    public int getArea() {
        area = height * width;
        return area;
    }
    public int getPerimeter() {
        perimeter = 2 * (height + width);
        return perimeter;
    }
    public String display(){
        return "Rectangle{" + "width=" + height + ", height=" + width + "}";
    }
    public void EnterData() {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = data.nextInt();
        System.out.print("Enter the width: ");
        width = data.nextInt();
    }
}
