public class BasictaxCalc implements TaxCalc {
    private final double taxRate;

    public BasictaxCalc(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public double calculate(double subtotal) {
        // TODO Auto-generated method stub
        return subtotal + subtotal * taxRate;
    }
    
}
