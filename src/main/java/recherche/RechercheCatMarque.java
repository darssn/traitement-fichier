package recherche;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import entites.Categorie;
import entites.Marque;
import entites.Produit;
import entites.Stock;

public class RechercheCatMarque extends Recherche {

	@Override
	public void traiter(Stock stock, Scanner scanner) throws Exception {
		
		System.out.println("Quelle est la marque recherchée ? ");
		String choix = scanner.nextLine();

		if (!Marque.exists(stock, choix)) {

			throw new Exception("Veuillez entrez une marque existante");

		}
		
		System.out.println("Quelle est la categorie recherchée ? ");
		 String choix2 = scanner.nextLine();

		if (!Categorie.exists(stock, choix2)) {

			throw new Exception("Veuillez entrez une catégorie existante");

		}
		
		
		List<Produit> produits = stock.getListeProduit();

		HashMap<String, String> listeProd = new HashMap<>();

		TreeMap newListeProd = new TreeMap(new ComparateurD(listeProd));

		for (Produit p : produits) {

			if (p.getMarque().getLibelle().equalsIgnoreCase(choix) &&  p.getCategorie().getLibelle().equalsIgnoreCase(choix2)) {

				listeProd.put(p.getNom(), p.getScoreNutritionnel());

			}
		}
		
		newListeProd.putAll(listeProd);

		Set<String> t = listeProd.keySet();
		Set<String> t1 = newListeProd.keySet();
		Iterator<String> iter = t.iterator();
		Iterator<String> iter1 = t1.iterator();

		String max = listeProd.get(iter1.next());

		System.out.println("\nLes meilleurs produits de la categorie " + choix2 + " et de la marque "+choix+" sont : \n");

		while (iter.hasNext()) {

			String nomProduit = iter.next();
			String val = listeProd.get(nomProduit);

			if (val.equals(max)) {

				System.out.println(
						"Categorie : " + choix + " ; Produit : " + nomProduit + " ; Grade nutritionnel : " + val);

			}
		}
		
		
	}

}
