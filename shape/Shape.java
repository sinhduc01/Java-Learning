package shape;

public class Shape {
    double area;
    String name;

    public Shape(String name) {
        this.name = name;
    }

    double caculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape [area=" + area + ", name=" + name + "]";
    }

}
