package people;

public class Manager extends Employee {
	int _year;
	int _grade;

	public Manager(String name, String id, int grade){
		_name = name;
		_id = id;
		_grade = grade;
	}
	public int getBonus(){
		return _salary*_year*2;
	}
}
