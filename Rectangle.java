public class Rectangle implements Shape {
    
    private int width;
    private int height;

    public Rectangle (int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive.");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (double)width*height;
    }

    @Override
    public double getPerimeter() {
        return (double)(2 * (width + height));
    }
}
