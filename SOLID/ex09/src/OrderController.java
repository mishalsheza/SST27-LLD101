public class OrderController {
    private final OrderRepository repository;

    OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    void create(String id) {
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}