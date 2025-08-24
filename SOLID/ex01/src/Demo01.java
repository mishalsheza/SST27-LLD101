

public class Demo01 {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        TaxCalc taxCalculator = new BasictaxCalc(0.18);
        OrderRepo repository = new InMemoryRepo();

        OrderService orderService = new OrderService(taxCalculator, notifier, repository);
        orderService.checkout("a@shop.com", 100.0);    }
}
