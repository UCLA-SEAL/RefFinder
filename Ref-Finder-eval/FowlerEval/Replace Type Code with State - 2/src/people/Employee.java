package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	
	private EmployeeType _type;
	
	int getType(){
		return _type.getTypeCode();
	}
	
	public int getBonus(){
		return _salary*_year*1;
	}
}
