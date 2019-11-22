package recherche;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import entites.Additif;
import entites.Allergene;
import entites.Produit;
import entites.Stock;

public class AdditifCourant extends Recherche {

	@Override
	public void traiter(Stock stock, Scanner scanner) throws Exception {

		List<Produit> produits = stock.getListeProduit();

		HashMap<String, Integer> ad = new HashMap<>();

		TreeMap newAl = new TreeMap(new Comparateur(ad));

		for (Produit p : produits) {

			

				for (Additif a : p.getListeAdditif()) {

					String additif = a.getLibelle().toLowerCase().trim();
					Integer num = ad.get(additif);

					if (num == null) {
						num = 0;
					}

					num++;

					ad.put(additif, num);

				}
			

		}

		newAl.putAll(ad);

		Set<String> t = newAl.keySet();
		Iterator<String> iter = t.iterator();

		int count = 0;
		while (iter.hasNext() && count < 10) {

			String nom = iter.next();
			Integer compteur = ad.get(nom);
			count++;

			System.out.println("Additif : " + nom + " - Nb d'occurence : " + compteur);

		}
	}

}
