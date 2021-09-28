package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	private int _type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	private Employee(int type) {
		_type = type;
	}
	
	static Employee create(int type) {
		return new Employee(type);
	}

	public int getBonus() {
		return _salary * _year * 1;
	}
	
	public static void main() {
		Employee tom = Employee.create(ENGINEER);
		tom.getBonus(); 
	}
}
