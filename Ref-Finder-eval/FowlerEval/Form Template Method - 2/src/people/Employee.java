package people;

public class Employee extends Person {
	
	int _year;
	
	double getBase(){
		return  _salary * 0.5;
		
	}
	
	double getTax(){
		return getBase() * _rate * 3;
	}

}
