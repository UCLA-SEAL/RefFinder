package people;

public class Person {
	Department _department;
	int _salary;
	
	int _year;
	int _grade;
	String _officeAreaCode;
	String _officeNumber;
	
	public String getTelephoneNumber() {
		return "(" + _officeAreaCode + ")" + _officeNumber;
	}

	public String getOfficeAreaCode() {
		return _officeAreaCode;
	}

	public void setOfficeAreaCode(String _officeAreaCode) {
		this._officeAreaCode = _officeAreaCode;
	}

	public String getOfficeNumber() {
		return _officeNumber;
	}

	public void setOfficeNumber(String _officeNumber) {
		this._officeNumber = _officeNumber;
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
