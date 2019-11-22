package recherche;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Comparateur implements Comparator{

	
	Map a ;
	
	public Comparateur(HashMap a) {
	
		this.a = a;
	}

	@Override
	public int compare(Object a, Object b) {
		
		
		if((int)this.a.get(a)> (int)this.a.get(b)){
			return -1;
		}else if((int)this.a.get(a)< (int)this.a.get(b)){
			return 1;
		}	
		return 0;
	}

}
