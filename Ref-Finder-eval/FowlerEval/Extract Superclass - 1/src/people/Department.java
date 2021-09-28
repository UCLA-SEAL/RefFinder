package people;

public class Department {
	private String _chargeCode;
	private Manager _manager;
	
	public Department(Manager x){
		_manager = x;
	}
	
	public Manager getManager(){
		return _manager;
	}
}
