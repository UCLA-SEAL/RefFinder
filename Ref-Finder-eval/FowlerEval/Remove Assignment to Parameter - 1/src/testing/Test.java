package testing;

public class Test {
	private static String result_;

	public static void assign(int myInt, char myChar, String helloworld) {
		if (myInt < 0)
			myInt = 0;
		helloworld += myChar + myInt;
		result_ = helloworld;
	}
}
