package account;

public class Account {
	
	int _balance;
	
	void withdraw(int amount) throws BalanceException{
		if(amount > _balance) throw new BalanceException();
			_balance -= amount;
	}
}
