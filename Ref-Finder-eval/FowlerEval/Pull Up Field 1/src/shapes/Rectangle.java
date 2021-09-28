package shapes;

public class Rectangle extends Quadrilateral implements Equiangular {
	private int height;
	private int width;

	public double calcArea() {
		return height*width;
	}
}
