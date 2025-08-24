public class OrderService {
    double taxRate = 0.18;
    EmailClient email = new EmailClient();

    // double totalWithTax(double subtotal) {
    //     return subtotal + subtotal * taxRate;
    // }
    // void checkout(String customerEmail, double subtotal) {
    //     double total = totalWithTax(subtotal);
    //     email.send(customerEmail, "Thanks! Your total is " + total);
    //     System.out.println("Order stored (pretend DB).");
    // }
    private final TaxCalc taxCalculator;
    private final Notifier notifier;
    private final OrderRepo repository;

    OrderService(TaxCalc taxCalculator, Notifier notifier, OrderRepo repository) {
        this.taxCalculator = taxCalculator;
        this.notifier = notifier;
        this.repository = repository;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculate(subtotal);
        repository.save(total);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
    }
}