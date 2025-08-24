public class StandardShip implements ShippingStrategy {

    @Override
    public double calculate(Shipment shipment) {
        // TODO Auto-generated method stub
        return 50 + 5 * shipment.weightKg;
    }

}
