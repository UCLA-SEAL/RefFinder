package people;

public class Employee extends Person {
	int _year;
	
	public double getBonus(){
		double base = _salary * 0.5;
		double tax = base * _rate * 3;
		return base * tax;
	}

}
