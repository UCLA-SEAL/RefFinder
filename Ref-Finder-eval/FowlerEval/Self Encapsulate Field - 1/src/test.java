
public class test {
	private int _low, _high;
	boolean includes (int arg){
		return arg >= _low && arg <= _high;
	}
	
	void grow(int factor) {
		_high = _high * factor;
	}
}
