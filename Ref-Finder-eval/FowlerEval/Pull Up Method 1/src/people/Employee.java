package people;

public class Employee extends Person {
	protected String _name;
	protected String _id;

	public int getBonus() {
		return _salary;
	}

	public int getPayamount(int s) {
		int result;
		int test = s;

		if (test == 1)
			result = 1;
		else {
			if (test == 2)
				result = 2;
			else {
				if (test == 3)
					result = 3;
				else
					result = 5;
			}
		}

		return result;
	}
}
