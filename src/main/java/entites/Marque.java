package entites;

import java.util.List;


public class Marque {

	

	private String libelle;
	
	public Marque(String libelle) {
		super();
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public static boolean exists(Stock stock ,String marque){
		
			
			boolean e = false;
			
			List<Produit> listeProduits = stock.getListeProduit();
			
			for(Produit p : listeProduits){
				
				if(p.getMarque().getLibelle().equalsIgnoreCase(marque)){
					
					return true;
				}
				
			}
			
			return e;
			
			
		}
		
	}
	

