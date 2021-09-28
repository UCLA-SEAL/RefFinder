package people;

public class Person {
	Department _department;
	int _salary;
	private BloodGr _bloodgr;

	public BloodGr getBloodGroup(){
		return _bloodgr;
	}
	
	public void setBloodGr(BloodGr arg){
		_bloodgr = arg;
	}
	
	public Person(BloodGr arg){
		_bloodgr = arg;
	}
	
	public Department getDepartment(){
		return _department;
	}
	
	public void setDepartment(Department arg){
		_department = arg;
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
