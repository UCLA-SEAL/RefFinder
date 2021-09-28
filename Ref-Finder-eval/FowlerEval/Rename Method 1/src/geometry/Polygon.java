package geometry;

import java.util.Iterator;
import java.util.List;

import shapes.Triangle;

public class Polygon {

	List<Point> points;

	public Polygon(List<Point> points) {
		this.points=points;
	}
	public boolean isInside(Point p) {
		//optimize by checking if p lies outside bounding box
		// best if p is usually well beyond polygon
		//Bounding box is also used to define 'infinite'
		int max_x = points.get(0).x;
		int max_y = points.get(0).y;
		int min_x = points.get(0).x;
		int min_y = points.get(0).y;
		for (Point pt : points) {
			if (pt.x>max_x) max_x=pt.x;
			if (pt.y>max_y) max_y=pt.y;
			if (pt.x<min_x) min_x=pt.x;
			if (pt.y<min_y) min_y=pt.y;
		}
		//check if point lies outside bounding box;
		if (p.x>max_x || p.y>max_y || p.x<min_x || p.y<min_y)
			return false;
		//count how many sides intersect with the segment p-(p.x,infinite)
		final int infinity = max_y+10;
		int count = 0;
		Segment p2infinity = new Segment(p, new Point(p.x, infinity));
		//count intersecting sides
		for (int i=0; i<points.size()-1; ++i) {
			Segment s = new Segment(points.get(i), points.get(i+1));
			if (s.getIntersection(p2infinity)!=null)
					count++;
		}
		Segment s = new Segment(points.get(points.size()-1), points.get(0));
		if (s.getIntersection(p2infinity)!=null)
			count++;
		//point is inside polygon iff count is odd
		if (count % 2 > 0)
			return true;
		else
			return false;
	}
	public boolean ISO() {
		//check if no two sides overlap
		for (int i=0; i<points.size()-1; ++i) {
			for (int j=i+1; j<points.size(); ++j) {
				Segment s1 = new Segment(points.get(i), points.get(i+1));
				Segment s2 = null;
				if (j<points.size()-1)
					s2 = new Segment(points.get(j), points.get(j+1));
				else
					s2 = new Segment(points.get(j), points.get(0));
				if (s1.getIntersection(s2)!=null) return false;
			}
		}
		return true;
	}
	public boolean isTriangle() {
		return (points.size()==3);
	}
	public double getArea() {
		//TODO:currently only know how to get area for triangles. all other polygons return zero
		if (isTriangle()) {
			Segment seg1 = new Segment(points.get(0), points.get(1));
			Segment seg2 = new Segment(points.get(1), points.get(2));
			Segment seg3 = new Segment(points.get(2), points.get(0));
			Triangle tri = new Triangle((int)seg1.getLength(), (int)seg2.getLength(), (int)seg3.getLength());
			return tri.calcArea();
		}
		return 0;
	}
	public String toString() {
		String res = "";
		Iterator<Point> iter = points.iterator();
		while (iter.hasNext()) {
			if (!res.isEmpty()) res+="-";
			res+=iter.next();
		}
		if (points.size()>0) {
			res+="-"+points.get(0);
		}
		return res;
	}
}
