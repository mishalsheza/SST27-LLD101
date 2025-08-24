public class CardPay implements PaymentMethod {

    @Override
    public String pay(double amount) {
        // TODO Auto-generated method stub
        return "Charged card: " + amount;

    }

}
