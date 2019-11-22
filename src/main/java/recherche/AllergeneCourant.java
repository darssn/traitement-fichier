package recherche;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import entites.Allergene;

import entites.Produit;
import entites.Stock;

public class AllergeneCourant extends Recherche {

	@Override
	public void traiter(Stock stock, Scanner scanner) throws Exception {

		List<Produit> produits = stock.getListeProduit();

		HashMap<String, Integer> al = new HashMap<>();

		TreeMap newAl = new TreeMap(new Comparateur(al));

		for (Produit p : produits) {

			for (Allergene a : p.getListeAllergene()) {

				String alergene = a.getLibelle().toLowerCase().trim();
				Integer ale = al.get(alergene);

				if (ale == null) {
					ale = 0;
				}

				ale++;

				al.put(alergene, ale);
			}
		}

		newAl.putAll(al);
		System.out.println(al);

		Set<String> t = newAl.keySet();
		Iterator<String> iter = t.iterator();

		while (iter.hasNext()) {

			String nom = iter.next();
			Integer compteur = al.get(nom);

			
				System.out.println("Allergene : " + nom + " - Nb d'occurence : " + compteur);
			
		}
	}

}
