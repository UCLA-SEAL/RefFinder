package people;

public class BloodGr{
	static final BloodGr O = new BloodGr(0);
	static final BloodGr A = new BloodGr(1);
	static final BloodGr B = new BloodGr(2);
	private static final BloodGr[] _values = {O, A, B};
	
	private final int _code;
	
	private BloodGr(int code){
		_code = code;
	}
	
	public static BloodGr code(int arg){
		return _values[arg];
	}
	
}
