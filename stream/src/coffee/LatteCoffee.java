package coffee;

public class LatteCoffee extends Decorator {

	public LatteCoffee(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		coffee.brewing();
		System.out.print(" Adding Milk");
		
	}

}
