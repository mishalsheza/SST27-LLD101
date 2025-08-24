
public class PaymentService {
    String pay(PaymentMethod method, double amount){
        return method.pay(amount);
    }
}