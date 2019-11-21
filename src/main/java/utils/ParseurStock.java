package utils;

import entites.Stock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import entites.Additif;
import entites.Allergene;
import entites.Categorie;
import entites.Ingredient;
import entites.Marque;
import entites.Produit;

public class ParseurStock {

	public static void ajoutLigne(Stock stock, String ligne, String nomLigne) {

		String m1 = ligne.replace('|', '_');

		m1 = m1.replace('[', ' ');
		m1 = m1.replace(']', ' ');

		String[] m = m1.split("_");

		String nlTemp = nomLigne.replace('|', '_');
		String[] nomLigneTab = nlTemp.split("_");

		Map<String, String> mapLigne = new HashMap<>();

		String nom = m[0];
		String scoreN = m[1];
		Categorie cat = new Categorie(m[2]);
		Marque marque = new Marque(m[3]);

		List<Ingredient> ingredient = Ingredient.listeProduit(m[4]);

		Map<String, String> ingAutres = new HashMap<>();

		for (int i = 5; i < 30; i++) {
			
			if(!m[i].isEmpty()){
			
				ingAutres.put(nomLigneTab[i],m[i]);
				
			}
		}
		

		List<Allergene> allergene = Allergene.listeProduit(m[30]);
		List<Additif> additif = Additif.listeProduit(m[31]);

		Produit prod = new Produit(nom, scoreN, cat, marque, ingredient, ingAutres, allergene, additif);

		stock.getListeProduit().add(prod);

	}

}
