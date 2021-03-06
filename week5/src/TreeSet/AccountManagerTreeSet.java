package TreeSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class AccountManagerTreeSet {

	public TreeSet<Account> accounts;
	
	public AccountManagerTreeSet(int size){
		accounts = new TreeSet<Account>(size);
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
