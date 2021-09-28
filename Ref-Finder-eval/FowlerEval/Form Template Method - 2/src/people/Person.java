package people;

public class Person {
	Department _department;
	int _salary;
	int _rate;
	
	public Department getDepartment(){
		return _department;
	}
	
	public void setDepartment(Department arg){
		_department = arg;
	}

	public double getBonus(){
		return getBase() * getTax();
	}
	
	double getBase(){
		return -1;
	}
	
	double getTax(){
		return -1;
	}
	

}
