package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
        System.out.println("Coffee");
		System.out.println(coffee.cost());

		Beverage latteWithChoco = new ChocolateDecorator(new Latte());
        System.out.println("Latte + Milk cost: " + latteWithChoco.cost());

        // Cappuccino with sugar and chocolate
        Beverage fancyCappuccino = new ChocolateDecorator(new HazelnutDecorator(new Cappuccino()));
        System.out.println("Cappuccino + Sugar + Chocolate cost: " + fancyCappuccino.cost());

		Beverage deluxeLatte = new ChocolateDecorator(new HazelnutDecorator(new StrawberryDecorator(new Latte())));
        System.out.println("Latte + Milk + Sugar + Chocolate cost: " + deluxeLatte.cost());
		
		

	}

}