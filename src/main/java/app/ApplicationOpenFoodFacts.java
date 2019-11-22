package app;

import java.util.Scanner;

import entites.Stock;
import recherche.RechercheProduitCategorie;
import recherche.RechercheProduitMarque;
import utils.Menu;
import utils.StockUtils;

public class ApplicationOpenFoodFacts {

	public static void main(String[] args) {
		
		String path = ClassLoader.getSystemClassLoader().getResource("open-food-facts.csv").getFile();
		
		Stock stock = StockUtils.lire(path);
		
		Scanner scanner = new Scanner(System.in);
		
		if (stock == null) {
			System.out.println("L'application doit s'arrétée en raison d'une erreur d'exécution.");
			System.exit(0);
		}
		
		int choixMenu = 0;
			
		
		do{
			Menu.affichMenu();	
			choixMenu = Integer.parseInt(scanner.nextLine());
			
		switch(choixMenu){
		
		case 1 :
			RechercheProduitMarque rechercheMarque = new RechercheProduitMarque();
			try {
				rechercheMarque.traiter(stock,scanner);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
			
			break;
		case 2 :
			
			RechercheProduitCategorie rechercheCategorie = new RechercheProduitCategorie();
			try {
				rechercheCategorie.traiter(stock,scanner);
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
			break ;
		case 3 :
			break;
		case 4 :
			break;
		case 5 :
			break;
	
			
			
			default :
		
		
		
		}
			
			
			
		}while(choixMenu !=6);
		
		
		System.out.println("Au revoir ");
		
		scanner.close();
	}

}
