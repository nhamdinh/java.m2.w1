public class HinhChuNhat extends Shape {
    double weigh;
    double high;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double weigh, double high) {
        this.weigh = weigh;
        this.high = high;
    }

    @Override
    public double tinhChuvi() {
        return (weigh + high)* 2;
    }

    @Override
    public double tinhDienTich() {
        return weigh * high;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
