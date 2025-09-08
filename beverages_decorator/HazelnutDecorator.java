package beverages_decorator;

public class HazelnutDecorator extends Beverage {
    private final Beverage beverage;

    public HazelnutDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

}
