public class Circle implements Shape {
    
    private double radius;
    static final double PI = 3.14;

    public Circle (double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (double)PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return (double)(2* PI * radius);
    }
}