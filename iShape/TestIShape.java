package iShape;

import shape.Shape;

public class TestIShape {
    public static void main(String[] args) {
        IShape s1 = new Circle(12.0);
        IShape s2 = new Rectangle(3.0, 4.5);
        IShape s3 = new Circle(14.0);
        IShape s4 = new Rectangle(6.0, 5.5);
        IShape s5 = new Circle(13.0);
        IShape s6 = new Rectangle(2.0, 4.0);
        IShape s7 = new Circle(24.0);
        IShape s8 = new Rectangle(6.0, 1.5);
        IShape[] shapes = { s1, s2, s3, s4, s5, s6 };
        int i = 1;
        for (IShape hinhDang : shapes) {
            System.out.println("Dien tich hinh thu " + i++ + " la:" + hinhDang.getArea());
        }
    }
}