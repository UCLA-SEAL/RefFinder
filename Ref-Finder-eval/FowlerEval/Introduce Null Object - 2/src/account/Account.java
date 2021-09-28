package account;

public class Account {
	
	int _balance;
	
	int withdraw(int amount) throws BalanceException{
		if(amount > _balance) throw new BalanceException();
			_balance -= amount;
			return _balance;
	}
	
	public int getPlan(){
		return _balance;
	}
}
