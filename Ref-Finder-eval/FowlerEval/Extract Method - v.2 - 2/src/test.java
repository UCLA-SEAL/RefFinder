
public class test {
	
	String _name;
	
	void printOwing(double amount){
		printBanner();
		printDetails(amount);

	}
	
	void printBanner(){
		System.out.println("********************************");
		System.out.println("********************************");
	}
	
	void printDetails(double amount){
		System.out.println("name:" + _name);
		System.out.println("amount" + amount);
	}
}
