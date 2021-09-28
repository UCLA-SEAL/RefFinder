package people;

public class Employee extends Person {
	int _year;
	
	public int getBonus(){
		return _salary*_year*1;
	}
	
	public void randomthing(){
		boolean chk = false;
		for(int i =  0; i < 100; i++){
			if(chk){
				if(i%18 == 0){
					System.out.println("Wow");
					chk = true;
				}
			}
		}
		
	}
	
}
