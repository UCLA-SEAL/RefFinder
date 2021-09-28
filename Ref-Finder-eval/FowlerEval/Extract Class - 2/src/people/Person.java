package people;

public class Person {
	Department _department;
	int _salary;
	
	int _year;
	int _grade;
	TelephoneNumber _telephoneNumber;
	
	public String getTelephoneNumber() {
		return _telephoneNumber.getTelephoneNumber();
	}

	public int getBonus(){
		return _salary*_year*2;
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
