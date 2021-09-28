package account;

public class Account {

	int _balance;
	int _senior;
	int _mDis;
	boolean _isPartTime;

	int withdraw(int amount) throws BalanceException {
		if (amount > _balance)
			throw new BalanceException();
		_balance -= amount;
		return _balance;
	}

	double disabilityAmount() {
		if (_senior < 2)
			return 0;
		if (_mDis > 12)
			return 0;
		if (_isPartTime)
			return 0;

		return 25 * _balance;
	}

	public double price() {
		double a = 23;
		double b = 12;
		double c = 56;

		return a * b + c;
	}
	
	public double Gamma (int inputVal, int quantity, int yearToDate) {
		double importantValue1 = (inputVal * quantity) + price();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100)
			importantValue2 -= 20;
		int importantValue3 = importantValue2 * 7;
		// and so on
		return importantValue3 - 2 * importantValue1;
	}
}
