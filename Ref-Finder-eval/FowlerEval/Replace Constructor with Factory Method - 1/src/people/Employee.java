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
}
