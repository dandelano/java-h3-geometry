/**
 * Created by school on 2/26/17.
 */
public class ComparableTriangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public ComparableTriangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public ComparableTriangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public ComparableTriangle(double side1, double side2, double side3, String color, boolean
            filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Uses Heron's formula to find the area of the triangle using
     * its three sides.
     * @return double Area of triangle
     */
    public double getArea() {
        // find the value of s = (a + b + c)/2
        double s = (this.side1 + this.side2 + this.side3)/2.0;
        // use s to find the area using formula sqrt(s(s - a)(s - b)(s - c))
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
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
        return String.format("%s\nTriangle area: %.3f", super.toString(), this.getArea());
    }

}
