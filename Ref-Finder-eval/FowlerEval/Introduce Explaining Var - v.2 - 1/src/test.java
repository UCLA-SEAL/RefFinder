
public class test {
	public double price(){
		return _quantity * _itemPrice - 
			Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
			Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}
	
	int _quantity;
	int _itemPrice;
}
