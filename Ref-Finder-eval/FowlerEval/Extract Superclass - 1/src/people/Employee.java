package people;

public class Employee{
	int _year;
	protected String _name;
	protected String _id;
	
	public int getBonus(){
		return _salary*_year*1;
	}
	
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
