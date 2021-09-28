package shapes;

public class Triangle extends Polygon {
	int a, b, c;

	public Triangle(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int numSides() {
		return 3;
	}

	public double calcArea() {
		//use Heron's formula to calculate area
		int p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	public int getLength(int index) {
		switch (index) {
		case 1:
			return a;
		case 2:
			return b;
		case 3:
			return c;
		}
		return 0;
	}

	public int getAllLengths(int[] lengths) {
		lengths = new int[4];
		lengths[0]=0;
		lengths[1]=a;
		lengths[2]=b;
		lengths[3]=c;
		return lengths.length;
	}
	
	public int calPeri(){
		int ans = a + b + c;
		return ans;
	}
}
