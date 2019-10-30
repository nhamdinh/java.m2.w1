public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", height=" + this.height +
                ", color=" + super.getColor() +
                ", Base area=" + super.getArea() +
                ", Volumn=" + this.getVolumn() +
                '}';
    }

}