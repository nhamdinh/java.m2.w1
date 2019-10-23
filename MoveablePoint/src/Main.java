public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1.toString());
        Point p2 = new Point(5,5);
        System.out.println(p2.toString());
        System.out.println();
        MoveablePoint mp1 = new MoveablePoint();
        System.out.println(mp1.toString());
        MoveablePoint mp2 = new MoveablePoint(6,6);
        System.out.println(mp2.toString());
        MoveablePoint mp3 = new MoveablePoint(8,8,9,9);
        System.out.println(mp3.toString());
        mp3 = mp3.move();
        System.out.println("After Move:");
        System.out.println(mp3.toString());

    }
}