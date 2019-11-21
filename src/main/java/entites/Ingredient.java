package entites;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
	
	
	

	private String libelle;

	public Ingredient(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	
public static List<Ingredient> listeProduit(String ligne){
	
			
		
		List<Ingredient> liste = new ArrayList<>();
		
		String[]m = ligne.split(",");
		
		for(int i = 0 ; i <m.length;i++){
			
			liste.add(new Ingredient(m[i].trim()));
					
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
