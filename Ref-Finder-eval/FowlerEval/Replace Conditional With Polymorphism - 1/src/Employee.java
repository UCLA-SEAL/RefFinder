public class Employee {
	int _year;
	protected String _name;
	protected String _id;
	public int _commision;
	public int _bonus;
	public int _salary;

	private EmployeeType _type;

	int getType() {
		return _type.getTypeCode();
	}

	void setType(int arg) {
		_type = EmployeeType.newType(arg);
	}

	int payAmount() {
		int e = getType();
		if (e == EmployeeType.ENGINEER)
			return _salary;
		else if (e == EmployeeType.MANAGER)
			return _salary + _bonus;
		else if (e == EmployeeType.SALESMAN)
			return _salary + _commision;
		else
			throw new RuntimeException();

	}

}
