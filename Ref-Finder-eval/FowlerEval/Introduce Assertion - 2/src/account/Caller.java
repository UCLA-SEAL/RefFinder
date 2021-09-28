package account;
import java.lang.Object;

import junit.framework.Assert;

public class Caller {
	
	Reading _reading = new Reading();
	int[] ok;
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
	
	public int testing3(int x){
		try{
			return ok[x];
		} catch (ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}
	
	final double NULL_EXPENSE = -1;
	final double _expense = NULL_EXPENSE;
	String primary;
	
	public double testing4(){
		Assert.assertTrue(_expense != NULL_EXPENSE || primary != null);
		return (_expense != NULL_EXPENSE)?
				_expense:
					primary.charAt(2);
	}
	
}
