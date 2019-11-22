package recherche;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class ComparateurD implements Comparator{
	
	
	Map a ;

	public ComparateurD(HashMap listeProd) {
	
		this.a = listeProd;
	}


	@Override
	public int compare(Object o1, Object o2) {
		
		 return ((String)a.get(o1)).compareTo((String)a.get(o2));
		
	}






	

}
