package sit.int204.lab01.beans;

public class Rectangle  implements GeometricShape {
    private double width = 1.0;
    private double height = 1.0;
    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public String toString() {
        return "Rectangle: ("+ width + " x " + height +
                ") -> "+ getArea();
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
