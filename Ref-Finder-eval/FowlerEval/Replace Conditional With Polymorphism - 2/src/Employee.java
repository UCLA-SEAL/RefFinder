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
		return _type.payAmount(this);

	}

}
