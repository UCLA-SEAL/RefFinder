package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	
	protected Employee(String name, String id){
		_name = name;
		_id = id;
	}
	
	public int getBonus(){
		return _salary*_year*1;
	}
}
