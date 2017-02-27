/**
 * Created by school on 2/26/17.
 */
public class ComparableCircle extends GeometricObject {
    private double radius;

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super();
        this.radius = radius;
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public int compareTo(GeometricObject object) {
        if(this.getArea() > object.getArea())
            return 1;
        else if(this.getArea() < object.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return String.format("%s\nCircle area: %.3f", super.toString(), this.getArea());
    }
}
