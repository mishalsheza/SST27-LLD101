public class ExpressShip implements ShippingStrategy {

    @Override
    public double calculate(Shipment shipment) {
        // TODO Auto-generated method stub
        return 80 + 8 * shipment.weightKg;
    }

}
