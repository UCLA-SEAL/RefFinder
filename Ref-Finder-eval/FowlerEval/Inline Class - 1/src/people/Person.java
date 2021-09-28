package people;

public class Person {
	
	public String getName(){
		return _name;
	}
	
	public String getTelNum(){
		return _officeTel.getTelNum();
	}
	
	TelephoneNumber getOfficeTel(){
		return _officeTel;
	}
	
	private String _name;
	private TelephoneNumber _officeTel = new TelephoneNumber();
	
}

