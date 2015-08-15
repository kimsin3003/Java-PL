package arraylist;

public class TestAccount {

	public static void main(String[] args) {
		
		AccountManagerArrayList manager = new AccountManagerArrayList();
		
		manager.insertAccount("1231", "Tomas", 3000.0F);
		manager.insertAccount("1232", "Edward", 4000.0F);
		manager.insertAccount("1233", "James", 5000.0F);
		
		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);

		manager.displayAll();
	}

}
