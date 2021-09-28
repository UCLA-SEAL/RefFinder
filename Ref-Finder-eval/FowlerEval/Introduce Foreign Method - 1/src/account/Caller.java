package account;

public class Caller {
	
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
		 Date pe = new Date(1,2,3);
		 Date newStart = new Date(pe.getYear(), pe.getMonth(), pe.getDay() + 1);
	 }
}
