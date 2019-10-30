public class HinhTron extends Shape{
    double radius;

    public HinhTron() {
    }

    public HinhTron(float radius) {
        this.radius = radius;
    }




    @Override
    public double tinhChuvi() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
