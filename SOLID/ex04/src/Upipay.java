public class Upipay implements PaymentMethod{

    @Override
    public String pay(double amount) {
        // TODO Auto-generated method stub
        return "Charged UPI: " + amount;
    }
}