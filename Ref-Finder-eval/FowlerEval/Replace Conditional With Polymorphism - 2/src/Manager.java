

public class Manager extends EmployeeType {
	
	int getTypeCode(){
		return EmployeeType.MANAGER;
	}

	@Override
	public int payAmount(Employee e) {
		return e._salary + e._bonus;
	}
	
}