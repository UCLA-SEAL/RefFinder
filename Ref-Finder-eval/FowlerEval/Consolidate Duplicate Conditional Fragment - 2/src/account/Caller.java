package account;

public class Caller {
	
	Reading _reading = new Reading();
	int ok;
	int ok2;
	
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
		Date s = new Date(1,2,3);
		int day = s.getDay();
		int month = s.getMonth();
		isGood(day, month);
	}
	
	public void isGood(int d, int m){
		if(d < m)System.out.println("Yes");
		else System.out.println("No");
	}
	
	public void sayYes(){
		System.out.println("Yes");
	}
	
	public void testing3(int x){
		int price;
		if(x < 23){
			price = 453;
		}else{
			price = 112;
		}
		
		sayYes();
	}
	
}
