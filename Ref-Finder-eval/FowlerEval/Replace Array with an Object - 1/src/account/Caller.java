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
	

		String[] row = new String[3];
		row[0] = "This is Testing";
		row[1] = "1234";

}
