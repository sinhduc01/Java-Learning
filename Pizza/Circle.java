package Pizza;

public class Circle implements IShape {
    private double _radius;

    public Circle(double r) {
        _radius = r;
    }

    public double getArea() {
        return Math.PI * _radius * _radius;
    }
}
