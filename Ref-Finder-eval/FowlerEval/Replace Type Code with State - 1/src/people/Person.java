package people;

public class Person {
	Department _department;
	int _salary;
	
	static final int o = 0;
	static final int a = 1;
	static final int b = 2;
	
	private int _bloodgr;
	
	
	public Department getDepartment(){
		return _department;
	}
	
	public void setDepartment(Department arg){
		_department = arg;
	}
	
	public int getPayamount(int s){
		int result;
		int test = s;
		
		if(test == 1) result = 1;
		else{
			if(test == 2) result = 2;
			else{
				if(test == 3) result = 3;
				else result = 5;
			}
		}
		
		switch(_bloodgr){
		case 0: System.out.println("woww");
		}
		return result;
	}
	

}
