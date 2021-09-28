

public class Salesman extends EmployeeType {
	int getTypeCode(){
		return EmployeeType.SALESMAN;
	}

	@Override
	public int payAmount(Employee e) {
		return e._salary + e._commision;
	}
}
