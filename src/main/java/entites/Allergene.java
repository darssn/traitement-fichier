package entites;

import java.util.ArrayList;
import java.util.List;

public class Allergene {

	
	
	private String libelle;
	
	public Allergene(String libelle) {
		super();
		this.libelle = libelle;
	}
	
	public static List<Allergene> listeProduit(String ligne){
		
		List<Allergene> liste = new ArrayList<>();
		
		String[]m = ligne.split(",");
		
		for(int i = 0 ; i <m.length;i++){
			
			liste.add(new Allergene(m[i].trim()));
			
			
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
