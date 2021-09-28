package people;

public class TelephoneNumber {
	public String getTelNum(){
		return (" (" + _areaCode + ") " + _number);
	}
	
	String getAreaCode(){
		return _areaCode;
	}
	
	void setAreaCode(String arg){
		_areaCode = arg;
	}
	
	String getNum(){
		return _number;
	}
	
	void setNum(String arg){
		_number = arg;
	}
		
	private String _number;
	private String _areaCode;
}
