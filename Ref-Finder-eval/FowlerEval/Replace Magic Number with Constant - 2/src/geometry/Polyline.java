package geometry;

import java.util.Iterator;
import java.util.List;

public class Polyline {

	List<Point> points;

	public Polyline(List<Point> points) {
		this.points=points;
	}
	public String toString() {
		String res = "";
		Iterator<Point> iter = points.iterator();
		while (iter.hasNext()) {
			if (!res.isEmpty()) res+="-";
			res+=iter.next();
		}
		return res;
	}
}
