package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	
	
	public int getBonus(){
		return _salary*_year;
	}
}
