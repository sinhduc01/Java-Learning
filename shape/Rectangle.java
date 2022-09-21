package shape;

public class Rectangle extends Shape {
    double width;
    double lenght;

    public Rectangle(String name, double width, double lenght) {
        super(name);
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    double caculateArea() {
        // TODO Auto-generated method stub
        return this.width * this.lenght;
    }

    @Override
    public String toString() {
        return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
    }

}
