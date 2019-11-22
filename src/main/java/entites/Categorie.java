package entites;

import java.util.List;

public class Categorie {
	
	

	private String libelle;
	
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	public static boolean exists(Stock stock ,String cat){
		
		
		boolean e = false;
		
		List<Produit> listeProduits = stock.getListeProduit();
		
		for(Produit p : listeProduits){
			
			if(p.getCategorie().getLibelle().equalsIgnoreCase(cat)){
				
				return true;
			}
			
		}
		
		return e;
		
		
	}
	

}
