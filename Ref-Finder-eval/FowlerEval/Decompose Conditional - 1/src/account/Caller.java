package account;

public class Caller {
	
	Reading _reading = new Reading();
	int ok;
	int ok2;
	int asd;
	Date s = new Date(1,2,3);
	
	public void call(){
		try{
				Account s = new Account();
				s.withdraw(23);
				System.out.println("haha");
		}catch (BalanceException e){
			System.out.println("eerror");
		}
	}
	 public void testing(){
		 MfDate s = new MfDate(1,2,3);
		 Date io = s.nextDay();
	 }
	 
	public Object lastReading(){
		return _reading.lastIndexOf(34);
	}
	
	public void testing2(){
		if(s.getYear() < 5 && s.getDay() >3) asd = ok * ok2;
		else asd = ok + ok2;
	}
	
}
