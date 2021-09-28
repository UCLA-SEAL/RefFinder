package people;

public class Manager extends Person {
	int _year;
	int _grade;

	public int getBonus(){
		return _salary*_year*2;
	}
}
