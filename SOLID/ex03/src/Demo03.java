public class Demo03 {
    public static void main(String[] args) {
        Shipment e = new Shipment(new ExpressShip(), 2.0);
        Shipment o = new Shipment(new OvernightShip(), 3.0);
        Shipment s = new Shipment(new StandardShip(), 4.0);

        System.out.println(new ShippingCostCalculator().cost(s));    
        System.out.println(new ShippingCostCalculator().cost(o));    
        System.out.println(new ShippingCostCalculator().cost(e));
    }
}
