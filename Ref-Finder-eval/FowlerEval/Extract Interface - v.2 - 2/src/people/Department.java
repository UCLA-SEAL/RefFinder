package people;

public class Department {
	private String _chargeCode;
	private Person _manager;
	
	public Department(Person x){
		_manager = x;
	}
	
	public Person getManager(){
		return _manager;
	}
	
	public double charge(Billable emp, int days){
		int base = emp.getBonus() * days;
		if(emp.hasSK())return base * 0.15;
		else return base;
	}
}
