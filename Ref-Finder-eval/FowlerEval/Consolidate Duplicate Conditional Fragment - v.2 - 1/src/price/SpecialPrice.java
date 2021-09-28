package price;

public class SpecialPrice {
	
	private int _date;
	private double _total;
	
	public boolean isSpecialDeal(){
		if(_date % 5 == 0) return true;
		else return false;
	}
	
	public void send(){
		System.out.println("Total price is " + _total + " .");
	}
	
	public void calPrice(int price){
		if(isSpecialDeal()){
			_total = price * 0.95;
			send();
		}else{
			_total = price * 0.98;
			send();
		}
	}
}
