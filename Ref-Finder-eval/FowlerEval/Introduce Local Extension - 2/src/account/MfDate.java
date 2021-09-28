package account;

public class MfDate extends Date{
	
	public MfDate(int a, int b, int c){
		super(a,b,c);
	}
	
	public MfDate(Date d){
		super(d.getYear(), d.getMonth(), d.getDay());
	}
	
	public Date nextDay(){
		return new Date(getYear(), getMonth(), getDay() + 1);
	}
	
	
}
