import java.util.Collections;
import java.util.Set;


public class test {
	private Set<String> _courses;
	
	public Set<String> getCourses() {
		return Collections.unmodifiableSet(_courses);
	}
	
	public void addCourse(String s) {
		_courses.add(s);
	}
	
	public void removeCourse(String s) {
		_courses.remove(s);
	}
}
