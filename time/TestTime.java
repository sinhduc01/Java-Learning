package time;

public class TestTime {
    public static void main(String[] args) {
        Time t = new Time(9, 12, 13);
        t.display();
        t.setTime(13, 32, 49);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(4, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}
