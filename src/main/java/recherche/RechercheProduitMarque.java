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

		TreeMap newListeProd = new TreeMap(new ComparateurD(listeProd));

		for (Produit p : produits) {

			if (p.getMarque().getLibelle().equalsIgnoreCase(choix)) {

				listeProd.put(p.getNom(), p.getScoreNutritionnel());

			}
		}

		newListeProd.putAll(listeProd);

		Set<String> t = listeProd.keySet();
		Set<String> t1 = newListeProd.keySet();
		Iterator<String> iter = t.iterator();
		Iterator<String> iter1 = t1.iterator();

		String max =listeProd.get(iter1.next());
		
		

		System.out.println("\nLes meilleurs produits de la marque " + choix + " sont : \n");

		while (iter.hasNext()) {

			String nomProduit = iter.next();
			String val = listeProd.get(nomProduit);

			
			if (val.equals(max)) {
				System.out.println("Produit : " + nomProduit + " ; Grade nutritionnel : " + val);

			}
		}
	}

}
