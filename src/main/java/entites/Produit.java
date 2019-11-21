package entites;

import java.util.List;
import java.util.Map;

public class Produit {
	
	

	
	private String nom;
	private String scoreNutritionnel ;
	private Categorie categorie ;
	private Marque marque;
		
	private List<Ingredient> listeIng;
	private Map<String,String> valNutritionnelles ;
	
	private List<Allergene> listeAllergene;		
	private List<Additif> listeAdditif ;
		
	
	public Produit(String nom, String scoreNutritionnel, Categorie categorie, Marque marque, List<Ingredient> listeIng,
			Map<String,String>valNutritionnelles, List<Allergene> listeAllergene, List<Additif> listeAdditif) {
		super();
		this.nom = nom;
		this.scoreNutritionnel = scoreNutritionnel;
		this.categorie = categorie;
		this.marque = marque;
		this.listeIng = listeIng;
		this.valNutritionnelles = valNutritionnelles;
		this.listeAllergene = listeAllergene;
		this.listeAdditif = listeAdditif;
	}
	
	
	public String toString(){
		
		return "Nom produit : "+this.nom+" ; Score nutritionnel : "+this.scoreNutritionnel+" ; Categorie : "+this.categorie+" ; Marque : "+this.marque ; 
		
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getScoreNutritionnel() {
		return scoreNutritionnel;
	}


	public void setScoreNutritionnel(String scoreNutritionnel) {
		this.scoreNutritionnel = scoreNutritionnel;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Marque getMarque() {
		return marque;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}


	public List<Ingredient> getListeIng() {
		return listeIng;
	}


	public void setListeIng(List<Ingredient> listeIng) {
		this.listeIng = listeIng;
	}


	public Map<String,String> getValNutritionnelles() {
		return valNutritionnelles;
	}


	public void setValNutritionnelles(Map<String,String> valNutritionnelles) {
		this.valNutritionnelles = valNutritionnelles;
	}


	public List<Allergene> getListeAllergene() {
		return listeAllergene;
	}


	public void setListeAllergene(List<Allergene> listeAllergene) {
		this.listeAllergene = listeAllergene;
	}


	public List<Additif> getListeAdditif() {
		return listeAdditif;
	}


	public void setListeAdditif(List<Additif> listeAdditif) {
		this.listeAdditif = listeAdditif;
	}
	
	
	
	
	
	

}
