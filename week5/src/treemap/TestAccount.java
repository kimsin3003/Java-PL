package treemap;

public class TestAccount {

	public static void main(String[] args) {
		
		AccountManagerHashMap manager = new AccountManagerHashMap();
		
		manager.insertAccount("1231", "Tomas", 3000.0F);
		manager.insertAccount("1232", "Edward", 4000.0F);
		manager.insertAccount("1233", "James", 5000.0F);
		manager.insertAccount("1234", "Percy", 6000.0F);
		manager.insertAccount("1231", "Tomas2", 7000.0F);
		
		/*manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		manager.setDeposite("1234", 500);
		manager.setDeposite("1231", 500);*/

		manager.displayAll();
		
	}

}
