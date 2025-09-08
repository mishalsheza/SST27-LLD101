package beverages_decorator;

public class StrawberryDecorator extends Beverage{
    private final Beverage beverage;

    public StrawberryDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 7;
    }
    
}
