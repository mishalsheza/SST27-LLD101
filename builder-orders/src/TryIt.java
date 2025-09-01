import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        Order o = new Order.Builder("o2", "a@b.com", l1)
                .addLine(l2)
                .discountPercent(10)
                .build();

        System.out.println("Before: " + o.totalAfterDiscount());

        // mutation attempt
        l1.setQuantity(999); // changes original line object
        System.out.println("After:  " + o.totalAfterDiscount());

        System.out.println("=> In the solution, totals remain stable due to defensive copies.");
    }
}
