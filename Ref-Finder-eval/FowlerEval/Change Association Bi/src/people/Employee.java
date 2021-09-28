package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	protected Department _department;
	
	public int getBonus(){
		return _salary*_year*1;
	}
	
	public Department getDepartment() {
		return _department;
	}
}
