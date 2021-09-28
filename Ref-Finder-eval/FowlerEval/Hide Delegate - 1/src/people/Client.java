package people;

public class Client {
	
	Person y = new Person();
	Department s = new Department(y);
	public void call(){
		y.getDepartment().getManager();
	}
}
