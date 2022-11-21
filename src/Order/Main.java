package Order;

public class Main {
    public static void main(String[] args) {
        Order o = new Order();
        Employer e = new Employer();
        o.addObserver(e);
        o.setOrder("Order 1");
    }
}
