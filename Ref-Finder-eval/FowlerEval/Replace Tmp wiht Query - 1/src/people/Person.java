package people;

public class Person {
	Department _department;
	int _salary;
	
	public Department getDepartment(){
		return _department;
	}
	
	public void setDepartment(Department arg){
		_department = arg;
	}
	
	public int getPayamount(int s){
		int result;
		int _test = _salary * 2;
		
		if(_test == 1) result = 1;
		else{
			if(_test == 2) result = 2;
			else{
				if(_test == 3) result = 3;
				else result = 5;
			}
		}
		
		return result;
	}
	

}
