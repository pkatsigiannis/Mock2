import java.util.List;
import java.util.ArrayList;

public class AllShapes {

    private List<Shape> shapes;
    
    public AllShapes() {
        shapes = new ArrayList<Shape>(50);
    }

    public void addShape(Shape shape) throws ExceedsMaximumCapacityException {

        if (shapes.size() >= 50) {
        throw new ExceedsMaximumCapacityException("List is full. Cannot add more shapes.");
        }       
        shapes.add(shape);
    }

    public void removeShape(Shape shape) throws DoesNotExistException {
        if (!shapes.contains(shape)) {
        throw new DoesNotExistException("Shape not found in the collection.");
        }
        shapes.remove(shape);
    }

    public void printAllAreas() {
        for (Shape s : shapes) {
            System.out.println("The area of the shape is: " + s.getArea());
        }
    }
}
