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
	/*
	double disabilityAmount(){
		
		if(isNotEligible())return 0;
		return 25*_balance;
	}
	
	boolean isNotEligible(){
		if(_senior < 2)return true;
		if(_mDis > 12) return true;
		if(_isPartTime) return true;
		return false;
	}*/
	
	double disabilityAmount() {
		if((_senior < 2) || (_mDis > 12) || _isPartTime) return 0;
		return 25*_balance;
	}
}
