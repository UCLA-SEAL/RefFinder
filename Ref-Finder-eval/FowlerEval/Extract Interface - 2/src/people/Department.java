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
	
	public void charge(Billable emp){
		if(emp.hasSK())System.out.println("www");
	}
}
