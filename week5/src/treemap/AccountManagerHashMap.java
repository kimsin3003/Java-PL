package treemap;

import java.util.Iterator;
import java.util.TreeMap;

public class AccountManagerHashMap {

	public TreeMap<AccountNumber, Account> accounts;
	
	public AccountManagerHashMap(){
		this(10);
	}
	
	public AccountManagerHashMap(int size){
		accounts = new TreeMap<AccountNumber, Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.put(new AccountNumber(accountNumber), account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		if(accounts.containsKey(accountNumber)){
			Account account = accounts.get(accountNumber);
			account.deposite(money);
			return;
		}
		
		System.out.println("There is no account");
		/*Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			Account account = ir.next();
			String tempNumber = account.getAccountNumber();
			
			if(accountNumber.equals(tempNumber)){
				account.deposite(money);
				return;
			}
		}*/
		
		
	}
	
	public void displayAll(){
		
		Iterator<AccountNumber> ir = accounts.keySet().iterator();
		while(ir.hasNext())
			System.out.println(ir.next());
	}
	
	
	
}