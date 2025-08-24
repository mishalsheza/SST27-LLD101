public class Shipment {
    private final ShippingStrategy strategy;
    final double weightKg;

    Shipment(ShippingStrategy strategy, double w) {
        this.strategy = strategy;
        this.weightKg = w;
    }

    double calculateCost() {
        return strategy.calculate(this);
    }
}