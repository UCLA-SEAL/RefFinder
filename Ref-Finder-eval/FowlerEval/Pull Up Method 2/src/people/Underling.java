package people;

public class Underling extends Employee {
	int _year;

	public Underling(String name, String id){
		_name = name;
		_id = id;
	}
	public int getBonus(){
		return _salary*_year;
	}
}
