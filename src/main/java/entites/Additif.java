package entites;

import java.util.ArrayList;
import java.util.List;

public class Additif {
	
	

	private String libelle;
	

	public Additif(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	
public static List<Additif> listeProduit(String ligne){
		
		List<Additif> liste = new ArrayList<>();
		
		String[]m = ligne.split(",");
		
		for(int i = 0 ; i <m.length;i++){
			
			liste.add(new Additif(m[i].trim()));
			
			
		}
		
		return liste;
		
			
		
	}


public String getLibelle() {
	return libelle;
}


public void setLibelle(String libelle) {
	this.libelle = libelle;
}

}
