package shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("cn1", 20, 30);
        Shape s2 = new Circle("ht", 15);
        Shape s3 = new Rectangle("cn2", 40, 20);
        Shape s4 = new Circle("ht2", 35);
        Shape[] shapeList = { s1, s2, s3, s4 };
        for (Shape s : shapeList) {
            System.out.println(s + " dien tich " + s.caculateArea());
        }
    }
}
