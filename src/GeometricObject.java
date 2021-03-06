/**
 * Created by school on 2/26/17.
 */
public abstract class GeometricObject implements Comparable<GeometricObject> {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return String.format("created on: %s\ncolor: %s filled: %b", dateCreated,
                color,
                filled);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract int compareTo(GeometricObject object);
}
