/**
 * Created by school on 2/26/17.
 */
public class ComparableRectangle extends GeometricObject {
    private double height;
    private double width;

    public ComparableRectangle() {
        super();
    }

    public ComparableRectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }

    public ComparableRectangle(double height, double width, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
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
        return String.format("%s\nRectangle area: %.3f", super.toString(), this.getArea());
    }
}
