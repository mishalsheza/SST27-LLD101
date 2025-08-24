public class InMemoryRepo implements OrderRepo {
    public void save(double total) {
        System.out.println("Order stored in memory with total = " + total);
    }
    
} 