package people;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Department {
	private String _chargeCode;
	private Person _manager;
	private Set<Employee> _employee_list;
	
	public Department(Person x){
		_manager = x;
		_employee_list = new HashSet<Employee>();
	}
	
	public Person getManager(){
		return _manager;
	}
	
	public Set<Employee> getEmployees() {
		return Collections.unmodifiableSet(_employee_list);
	}
	
	public void addEmployee(Employee e) {
		_employee_list.add(e);
	}
		
}
