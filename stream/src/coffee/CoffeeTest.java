package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Americano();
		americano.brewing(); //-> Americano Coffee 출력
		Coffee latte = new LatteCoffee(new Americano());
		latte.brewing(); //-> Americano Coffee Adding Milk출력
		Coffee mocha = new MochaCoffee(new LatteCoffee(new Americano()));
		mocha.brewing(); //-> Americano Coffee Adding Milk Adding Mocha Syrup 출력
	}

}
