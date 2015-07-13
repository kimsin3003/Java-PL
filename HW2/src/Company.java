
public class Company<Singleton> {
	
	private static Company instance = new Company();
	
	public Car cars[];
	
	private Company(){
		cars = new Car[6];
		for(int i = 0; i < 3; i++)
			cars[i] = new Sonata();
		
		cars[3] = new Grandeur();
		cars[4] = new Grandeur();
		cars[5] = new Genesis();
	}
	
	public static Company getInstance(){
		
		if(instance == null)
			instance = new Company<Object>();
		
		return instance;
		
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
}
