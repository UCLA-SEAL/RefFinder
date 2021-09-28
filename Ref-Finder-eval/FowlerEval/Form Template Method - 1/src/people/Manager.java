package people;

public class Manager extends Person {
	int _year;
	
	public double getBonus(){
		double base = _salary * 2;
		double tax = base * _rate * 5;
		return base * tax;
	}
	
}
