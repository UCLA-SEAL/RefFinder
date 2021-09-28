
public abstract  class EmployeeType {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	int getTypeCode() {
		return -1;
	}

	public static EmployeeType newType(int arg) {
		switch (arg) {
		case ENGINEER:
			return new Engineer();
		case MANAGER:
			return new Manager();
		case SALESMAN:
			return new Salesman();
		default:
			throw new IllegalArgumentException();
		}
	}

	public abstract int payAmount(Employee employee);


}
