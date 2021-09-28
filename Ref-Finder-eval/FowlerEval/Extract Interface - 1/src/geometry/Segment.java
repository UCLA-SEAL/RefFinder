package geometry;

public class Segment {

	Point pt1;
	Point pt2;
	
	public Segment(Point pt1, Point pt2) {
		this.pt1=pt1;
		this.pt2=pt2;
	}
	public Point getIntersection(Segment s) {
		int x1 = pt1.x;
		int y1 = pt1.y;
		int x2 = pt2.x;
		int y2 = pt2.y;
		int x3 = s.pt1.x;
		int y3 = s.pt1.y;
		int x4 = s.pt2.x;
		int y4 = s.pt2.y;

		int d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
		if (d == 0)
			return null;

		int xi = ((x3 - x4) * (x1 * y2 - y1 * x2) - (x1 - x2)
				* (x3 * y4 - y3 * x4))
				/ d;
		int yi = ((y3 - y4) * (x1 * y2 - y1 * x2) - (y1 - y2)
				* (x3 * y4 - y3 * x4))
				/ d;

		Point p = new Point(xi, yi);
		if (xi < Math.min(x1, x2) || xi > Math.max(x1, x2))
			return null;
		if (xi < Math.min(x3, x4) || xi > Math.max(x3, x4))
			return null;
		return p;
	}
	public double getLength() {
		int a = pt1.x-pt2.x;
		int b = pt1.y-pt2.y;
		return Math.sqrt(a^2+b^2);
	}
	public String toString() {
		return pt1.toString()+"-"+pt2.toString();
	}
}
