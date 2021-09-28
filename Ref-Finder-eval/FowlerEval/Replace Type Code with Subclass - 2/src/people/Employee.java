package people;

public class Employee extends Person {
	int _year;
	protected String _name;
	protected String _id;
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	
	static Employee create(int type){
		switch (type){
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		default: 
			throw new IllegalArgumentException("Incorrect type code calue");
		}
	}
	
	public int getBonus(){
		return _salary*_year*1;
	}
}
