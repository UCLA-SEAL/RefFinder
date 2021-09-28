
public class test {
	private int _low, _high;
	boolean includes (int arg){
		return arg >= getLow() && arg <= getHigh();
	}
	
	void grow(int factor) {
		setHigh(getHigh() * factor);
	}
	
	int getLow(){
		return _low;
	}
	
	int getHigh(){
		return _high;
	}

	private void setHigh(int _high) {
		this._high = _high;
	}
}
