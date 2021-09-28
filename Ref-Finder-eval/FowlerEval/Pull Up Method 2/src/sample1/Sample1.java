package sample1;

import geometry.Point;

public class Sample1 {

	private static void printHeader() {
		System.out.println("Evolution considered harmful");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3,16);
		System.out.println("~~~~~~~~~~~~~~~");
		printHeader();
		System.out.println("Point p is at "+p);
		PrettyPrinter.printTail();
		System.out.println("~~~~~~~~~~~~~~~");
	}

}
