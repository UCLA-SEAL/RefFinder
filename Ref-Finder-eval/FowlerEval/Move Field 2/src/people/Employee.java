package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	boolean _isPartTime; 
	
	public int getBonus(){
		if(_isPartTime)
			return 0;
		return _salary*_year*1;
	}
}
