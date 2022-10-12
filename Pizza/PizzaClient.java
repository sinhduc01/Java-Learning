package Pizza;

public class PizzaClient {
    public void run() {

        Pizza p1 = new Pizza(3.99, new Circle(2.5));
        Pizza p2 = new Pizza(4.99, new Rectangle(6, 4));
        PizzaDeal pd = new PizzaDeal();
        System.out.println(p1 + " is a better deal than " + p2
                + ": " + pd.betterDeal(p1, p2));

    }

    public static void main(String[] nu) {
        new PizzaClient().run();
    }

}
