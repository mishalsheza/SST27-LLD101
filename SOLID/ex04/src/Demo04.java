
public class Demo04 {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        System.out.println(service.pay(new Upipay(), 499));
        System.out.println(service.pay(new CardPay(), 1000));
        System.out.println(service.pay(new WalletPay(), 250));    }
}
