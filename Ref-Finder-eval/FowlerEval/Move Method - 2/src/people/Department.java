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
	
	public int getPayamount(int s){
		int result;
		int test = s;
		
		if(test == 1) result = 1;
		else{
			if(test == 2) result = 2;
			else{
				if(test == 3) result = 3;
				else result = 5;
			}
		}
		
		return result;
	}
}
