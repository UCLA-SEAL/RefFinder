package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public Employee(int type) {
		_type = type;
	}

	public int getBonus() {
		return _salary * _year * 1;
	}
	
	public static void main() {
		Employee tom = new Employee(ENGINEER);
		tom.getBonus(); 
	}
	
	@Override
	public int hashCode() {
		return _name.hashCode();
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Employee))
			return false;
		Employee guy = (Employee)other;
		return this._name.equals(guy._name);
	}
}
