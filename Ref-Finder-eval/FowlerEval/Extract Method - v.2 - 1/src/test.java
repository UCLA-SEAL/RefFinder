
public class test {
	
	String _name;
	
	void printOwing(double amount){
		printBanner();
		
		System.out.println("name:" + _name);
		System.out.println("amount" + amount);
	}
	
	void printBanner(){
		System.out.println("********************************");
		System.out.println("********************************");
	}
}
