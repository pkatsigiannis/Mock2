public class ShapesProgram {

    public static void main(String[] args) {
    
        AllShapes allShapes = new AllShapes();
        Rectangle r1 = new Rectangle(45, 23);
        Rectangle r2 = new Rectangle(5, 26);
        Circle c1 = new Circle(5.32);


        try {
            allShapes.addShape(r1);
        }
        catch (ExceedsMaximumCapacityException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            allShapes.addShape(r2);
        }
        catch (ExceedsMaximumCapacityException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            allShapes.removeShape(c1);
        }
        catch (DoesNotExistException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        allShapes.printAllAreas();
    }
}
