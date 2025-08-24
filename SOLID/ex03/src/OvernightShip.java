public class OvernightShip implements ShippingStrategy {

    @Override
    public double calculate(Shipment shipment) {
        // TODO Auto-generated method stub
        return 120 + 10 * shipment.weightKg;
    }

}
