package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import entites.Produit;
import entites.Stock;


public class StockUtils {
	
	
	public static Stock lire(String cheminFichier){
		Stock stock = new Stock();
		
		List<String> lignes = null;
		try {
			File file = new File(cheminFichier);
			lignes = FileUtils.readLines(file, "UTF-8");
			
			// On supprime la ligne d'entéte avec les noms des colonnes
			
			String nomLigne = lignes.get(0);
			
			lignes.remove(0);
			
		
			
			
			for (String ligne: lignes){
				
				ParseurStock.ajoutLigne(stock,ligne,nomLigne);
			}
			return stock;
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}
