package coffee;

public class MochaCoffee extends Decorator {

	public MochaCoffee(Coffee coffee) {
		super(coffee);
	}

	@Override
	public void brewing() {
		coffee.brewing();
		System.out.print(" Adding Mocha Syrup");
		
	}

}
