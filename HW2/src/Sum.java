
public class Sum {
	private Company company = Company.getInstance();
	
	public int sum(){
		int sum = 0;
		for(int i = 0; i < 6; i++){
			sum += company.cars[i].price;
		}
		
		return sum;
	}
}
