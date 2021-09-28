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
	
	public double getPayamount(int s){
		if(s < 0) return halfSal();
		if (s > 0) return doubleSal();
		if(s == 0)return normalSal();
		return (halfSal() + doubleSal());

	}
	
}
