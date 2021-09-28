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

	public int normalSal(){
		return _salary;
	}
	
	public int doubleSal(){
		return _salary * 2;
	}
	
	public int halfSal(){
		return _salary / 2;
	}
	
	public int getPayamount(int s){
		int test = s;
		
		boolean pos = test > 0;
		boolean neg = test < 0;
		
		if(pos) return normalSal();
		if(neg) return doubleSal();

		return 8;
	}
	
}
