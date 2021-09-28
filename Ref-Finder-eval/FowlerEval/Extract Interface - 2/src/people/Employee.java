package people;

public class Employee extends Person implements Billable {
	int _year;
	protected String _name;
	protected String _id;
	
	
	public int getBonus(){
		return _salary*_year*1;
	}

	public boolean hasSK(){
		return true;
	}
}
