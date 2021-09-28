

public class Engineer extends EmployeeType {
	
	int getTypeCode(){
		return EmployeeType.ENGINEER;
	}

	@Override
	public int payAmount(Employee e) {
		return e._salary;
	}

}
