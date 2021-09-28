package people;

public class TelephoneNumber {
	String _officeAreaCode;
	String _officeNumber;
	
	public String getTelephoneNumber() {
		return "(" + _officeAreaCode + ")" + _officeNumber;
	}

	public String getOfficeAreaCode() {
		return _officeAreaCode;
	}

	public void setOfficeAreaCode(String _officeAreaCode) {
		this._officeAreaCode = _officeAreaCode;
	}

	public String getOfficeNumber() {
		return _officeNumber;
	}

	public void setOfficeNumber(String _officeNumber) {
		this._officeNumber = _officeNumber;
	}
}
