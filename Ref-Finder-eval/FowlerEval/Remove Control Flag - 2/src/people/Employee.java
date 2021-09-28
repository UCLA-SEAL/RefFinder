package people;

public class Employee extends Person {
	int _year;
	
	public int getBonus(){
		return _salary*_year*1;
	}
	
	public void randomthing(){
		for(int i =  0; i < 100; i++){
			
				if(i%18 == 0){
					System.out.println("Wow");
					break;
				}
		}
		
	}
}
