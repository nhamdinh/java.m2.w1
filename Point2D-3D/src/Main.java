public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(5, 5);
        System.out.println(p2d.toString());
        Point3D p3d = new Point3D(6, 6, 6);
        System.out.println(p3d.toString());
        Point3D p3d2 = new Point3D();
        System.out.println(p3d2.toString());
    }
}