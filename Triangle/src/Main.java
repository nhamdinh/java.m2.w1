public class Main {
    public static void main(String[] args) {
        Shape s1= new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("yellow",false);
        System.out.println(s2.toString());

        Triangle t1 = new Triangle();
        System.out.println(t1.toString());
        Triangle t2 = new Triangle(6.0,6.0,6.0);
        System.out.println(t2.toString());
        Triangle t3 = new Triangle("red",false,9.0,9.0,9.0);
        System.out.println(t3.toString());
    }
}