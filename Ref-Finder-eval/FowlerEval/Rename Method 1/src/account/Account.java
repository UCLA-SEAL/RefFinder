package account;

public class Account {
	
	int _balance;
	int _senior;
	int _mDis;
	boolean _isPartTime;
	
	int withdraw(int amount) throws BalanceException{
		if(amount > _balance) throw new BalanceException();
			_balance -= amount;
			return _balance;
	}
	
	double disabilityAmount(){
		if(_senior < 2)return 0;
		if(_mDis > 12) return 0;
		if(_isPartTime) return 0;
		
		return 25*_balance;
	}
	
	double price(){
		double a = 23;
		double b = 12;
		double c = 56;
		
		return a*b + c;
	}
}
