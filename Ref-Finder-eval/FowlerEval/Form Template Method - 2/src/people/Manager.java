package people;

public class Manager extends Person {
	
	int _year;
	
	double getBase(){
		return  _salary * 2;
		
	}
	
	double getTax(){
		return getBase() * _rate * 5;
	}


}
