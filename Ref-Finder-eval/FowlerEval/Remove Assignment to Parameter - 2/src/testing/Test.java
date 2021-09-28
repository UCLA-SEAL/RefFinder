package testing;

public class Test {
	private static String result_;

	public static void assign(int myInt, char myChar, String helloworld) {
		int otherint = myInt;
		if (myInt < 0)
			otherint = 0;
		helloworld += myChar + otherint;
		result_ = helloworld;
	}
}
