
public class test {

	String foundPerson(String[] ppl){
		for(int i = 0; i < ppl.length; i++){
			if(ppl[i].equals("Don")){
				return "Don";
			}
			if(ppl[i].equals("John")){
				return "John";
			}
			if(ppl[i].equals("Kent")){
				return "Kent";
			}
		}
		
		return "";	
	}
	
}
