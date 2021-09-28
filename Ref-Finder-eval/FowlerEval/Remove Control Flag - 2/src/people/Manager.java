package people;

public class Manager extends Person {
	int _year;
	
	public int getBonus(){
		return _salary*_year*2;
	}
}
