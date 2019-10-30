
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        Circle c2 = new Circle(6,"red");
        System.out.println(c2.toString());

        Cylinder cl1 = new Cylinder();
        System.out.println(cl1.toString());
        Cylinder cl2 = new Cylinder(6);
        System.out.println(cl2.toString());
        Cylinder cl3 = new Cylinder(6,"blue",6);
        System.out.println(cl3.toString());
    }
}