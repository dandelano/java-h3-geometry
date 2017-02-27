import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by school on 2/26/17.
 */
public class TwoDShapesDelanoHW3 {

    public static void main(String[] args) {
        
        // Create an ArrayList of 9 shape objects, 3 triangles, 3 circles, 3 rectangles
        // make sure that the area of all 9 shapes are withing 10 and 50
        ArrayList<GeometricObject> geoObjectsList = new ArrayList<GeometricObject>();
        geoObjectsList.add(new ComparableTriangle(6,2,5));
        geoObjectsList.add(new ComparableTriangle(3,5,4));
        geoObjectsList.add(new ComparableTriangle(3,4,6));
        
        geoObjectsList.add(new ComparableCircle(3));
        geoObjectsList.add(new ComparableCircle(1));
        geoObjectsList.add(new ComparableCircle(2));
        
        geoObjectsList.add(new ComparableRectangle(9,2));
        geoObjectsList.add(new ComparableRectangle(2,6));
        geoObjectsList.add(new ComparableRectangle(4,3));

        System.out.println("\nUnsorted\n");

        for(GeometricObject shape : geoObjectsList) {
            System.out.println(shape.toString() + "\n");
        }

        GeometricObject[] sortedGeoObjects = geoObjectsList.toArray(new
                GeometricObject[geoObjectsList.size()]);

        Arrays.sort(sortedGeoObjects);

        System.out.println("\nSorted\n");

        for(GeometricObject shape : sortedGeoObjects) {
            System.out.println(shape.toString() + "\n");
        }

    }
}
