
public class test {
	public double price(){
		
		final double basePrice =  _quantity * _itemPrice;
		final double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		final double shipping = Math.min(_quantity * _itemPrice * 0.1, 100.0);
		
		return basePrice - quantityDiscount + shipping;
	}
	
	int _quantity;
	int _itemPrice;
}
