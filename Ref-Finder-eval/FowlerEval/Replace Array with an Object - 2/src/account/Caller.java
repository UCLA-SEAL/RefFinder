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
	

		Performance row = new Performance();
		row.setName("This is Testing");
		row.setWins("1234");

}
