import java.util.List;
import java.util.Arrays;;


public class test {

	String foundPerson(String[] ppl){
		List candidates = Arrays.asList(new String[] {"Don", "John", "Kent"});
		for(int i=0; i < ppl.length; i++){
			if(candidates.contains(ppl[i])) return ppl[i];
		}
		return "";
	}
	
}
