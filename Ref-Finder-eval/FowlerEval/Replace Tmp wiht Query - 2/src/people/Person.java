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

		if(testss() == 1) result = 1;
		else{
			if(testss() == 2) result = 2;
			else{
				if(testss() == 3) result = 3;
				else result = 5;
			}
		}
		
		return result;
	}
	
	public int testss(){
		return _salary * 2;
	}

}
