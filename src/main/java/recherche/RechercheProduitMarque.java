package recherche;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.lang3.math.NumberUtils;

import entites.Marque;
import entites.Produit;
import entites.Stock;

public class RechercheProduitMarque extends Recherche {

	@Override
	public void traiter(Stock stock, Scanner scanner) throws Exception {

		System.out.println("Quelle est la marque recherchée ? ");
		String choix = scanner.nextLine();

		if (!Marque.exists(stock, choix)) {

			throw new Exception("Veuillez entrez une marque existante");

		}

		List<Produit> produits = stock.getListeProduit();

		HashMap<String, String> listeProd = new HashMap<>();

		TreeMap<String,String> newListProd = new TreeMap<String,String>(new ComparateurD(listeProd));

		for (Produit p : produits) {

			if (p.getMarque().getLibelle().equalsIgnoreCase(choix)) {

				listeProd.put(p.getNom(), p.getScoreNutritionnel());

			}
		}

		newListProd.putAll(listeProd);

		Set<String> t = listeProd.keySet();
		Iterator<String> iter = t.iterator();

		String max=null;
		
		System.out.println("\nLes meilleurs produits de la marque "+choix +" sont : \n");
		

		while (iter.hasNext()) {

			String nomProduit = iter.next();
			String val = listeProd.get(nomProduit);

			if (max == null) {

				max = val;

			}

			if (val.equals(max)) {
				System.out.println("Produit : " + nomProduit + " ; Grade nutritionnel : " + val);
			}
		}

	}
}
