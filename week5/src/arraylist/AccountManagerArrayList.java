package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountManagerArrayList {

	public ArrayList<Account> accounts;
	
	public AccountManagerArrayList(){
		this(0);
	}
	
	public AccountManagerArrayList(int size){
		accounts = new ArrayList<Account>(size);
	}
	
	public void insertAccount(String accountNumber, String accountName, float balance){
		Account account = new Account(accountNumber, accountName, balance);
		accounts.add(account);
	}
	
	public void setDeposite(String accountNumber, float money){
		
		Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext()){
			Account account = ir.next();
			String tempNumber = account.getAccountNumber();
			
			if(accountNumber.equals(tempNumber)){
				account.deposite(money);
				return;
			}
		}
		
		System.out.println("There is no account");
	}
	
	public void displayAll(){
		
		Iterator<Account> ir = accounts.iterator();
		
		while(ir.hasNext())
			System.out.println(ir.next());
			
	}
	
	
}
