package entites;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private List<Produit> listeProduit = new ArrayList<>();
	
	

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}
	
	

}
