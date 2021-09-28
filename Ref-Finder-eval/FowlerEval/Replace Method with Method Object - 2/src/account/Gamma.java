package account;

public class Gamma {
	private final Account _account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private double importantValue1;
	private int importantValue2;
	private int importantValue3;

	Gamma(Account s, int inputValArg, int quantityArg, int yearToDateArg) {
		_account = s;
		inputVal = inputValArg;
		quantity = quantityArg;
		yearToDate = yearToDateArg;
	}

	double compute() {
		importantValue1 = (inputVal * quantity) + _account.price();
		importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100)
			importantValue2 -= 20;
		importantValue3 = importantValue2 * 7;
		// and so on
		return importantValue3 - 2 * importantValue1;
	}
}
