package recherche;

import java.util.Comparator;
import java.util.HashMap;


public class ComparateurD implements Comparator{
	
	
	HashMap a ;

	public ComparateurD(HashMap listeProd) {
	
		this.a = listeProd;
	}

	public int compare(String a, String b) {
			
		 return a.compareToIgnoreCase(b);
		 
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}






	

}
