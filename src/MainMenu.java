import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;
public class MainMenu {
	public static ArrayList<Recette> listRecettes = new ArrayList<Recette>();
	public static ArrayList<Type> listTypes = new ArrayList<Type>();
	public static ArrayList<Aliment> listIngredients = new ArrayList<Aliment>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Type dessert = new Type(01, "Dessert");
		Type plat = new Type(02, "Plat principal");
		listTypes.add(dessert);
		listTypes.add(plat);
		String choix;
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************************"+"\n"+
						   "*	Bienvenue sur le magasin   				*"+"\n"+
						   "*                              				*"+"\n"+
						   "*	Tappez une touche          				*"+"\n"+
						   "*                              				*"+"\n"+
						   "* [A] Pour créer un aliment    				*"+"\n"+
						   "* [B] Pour créer une recette   				*"+"\n"+
						   "* [C] Pour afficher les recettes			*"+"\n"+
						   "* [Q] Pour quitter                         	*"+"\n"+
						   "*                              				*"+"\n"+
						   "*********************************************"

		);
		
		do{
			choix = sc.nextLine();
			if(choix.equals("A")){
				System.out.println("Vous avez choisi de : Créer un aliment");
				creerAliment();
			}
			else if(choix.equals("B")){
				System.out.println("Vous avez choisi de : Créer une recette");
				creerRecette();
			}
			else if(choix.equals("C")){
				System.out.println("Vous avez choisi de : Afficher les recettes");
				afficherRecette();
			}
		}
		while(!choix.equals("q"));
	}
	
	public static void creerAliment(){
		Scanner scAlim = new Scanner(System.in);
		String alim;
		System.out.println("Vous souhaitez créer un aliment"+"\n");
		System.out.println("Quel type d'aliments?"+"\n");
		System.out.println(" [L] un légume? "+"\n"+
						   " [F] un fruit? "+"\n"+
						   " [V] une viande? "+"\n");
		alim = scAlim.nextLine();
		if(alim.equals("L")){
			int id;
			Double calories;
			String nom;
			System.out.println("Vous avez choisi de : un Légume");
			System.out.println("Selectionner un numero d'ID");
			Scanner scId = new Scanner(System.in);
			id = scId.nextInt();
			System.out.println("Selectionner le nom de l'aliment");
			Scanner scNom = new Scanner(System.in);
			nom = scNom.nextLine();
			System.out.println("Selectionner le numero de calories");
			Scanner scCal = new Scanner(System.in);		// TODO Auto-generated constructor stub

			calories = scCal.nextDouble();
			
			Legume unLegume = new Legume(id, nom, calories);
			listIngredients.add(unLegume);
		}
		else if(alim.equals("F")){
			System.out.println("Vous avez choisi de : Créer un fruit");
			int id;
			Double calories;
			String nom;
			System.out.println("Vous avez choisi de : un Légume");
			System.out.println("Selectionner un numero d'ID");
			Scanner scId = new Scanner(System.in);
			id = scId.nextInt();
			System.out.println("Selectionner le nom de l'aliment");
			Scanner scNom = new Scanner(System.in);
			nom = scNom.nextLine();
			System.out.println("Selectionner le numero de calories");
			Scanner scCal = new Scanner(System.in);
			calories = scCal.nextDouble();
			
			Fruit unfruit = new Fruit(id, nom, calories);
			listIngredients.add(unfruit);
		}
		else if(alim.equals("V")){
			System.out.println("Vous avez choisi de : Créer une viande");
			int id;
			Double calories;
			String nom;
			System.out.println("Vous avez choisi de : un Légume");
			System.out.println("Selectionner un numero d'ID");
			Scanner scId = new Scanner(System.in);
			id = scId.nextInt();
			System.out.println("Selectionner le nom de l'aliment");
			Scanner scNom = new Scanner(System.in);
			nom = scNom.nextLine();
			System.out.println("Selectionner le numero de calories");
			Scanner scCal = new Scanner(System.in);
			calories = scCal.nextDouble();
			
			Viande uneViande = new Viande(id, nom, calories);
			listIngredients.add(uneViande);
		}
	}
	
	public static void creerRecette(){
		String nom, type;
		String typeTest = null;
		int typeIntTest = 0;
		
		boolean typeVerif = false;
		Type monType;
		int tpPrep, tpCuis, lvl, numero;
		System.out.println("Vous allez Créer une Recette: en tant que tel , choisissez un Nom pour votre recette"+"\n");
		Scanner scNom = new Scanner(System.in);
		nom = scNom.nextLine();
		System.out.println("Choisissez un temps de preparation");
		Scanner scTpPrep = new Scanner(System.in);
		tpPrep = scTpPrep.nextInt();
		System.out.println("Choisissez un temps de cuisson");
		Scanner scTpCuisson = new Scanner(System.in);
		tpCuis = scTpCuisson.nextInt();
		System.out.println("Choisissez un niveau de difficulté");
		Scanner scLvl = new Scanner(System.in);
		lvl = scLvl.nextInt();
		System.out.println("Choisissez un numero pour votre recette");
		Scanner scNum = new Scanner(System.in);
		numero = scNum.nextInt();
		
		System.out.println("Donnez lui un type");
		System.out.println("Voici les types disponibles: ");
		System.out.println("\n");

		if(listTypes.size() == 0){
			System.out.println("ERREUR PAS DE TYPE? sauf que vous pouvez pas arriver ici haha");
		}
		
		for (int i =0; i<listTypes.size(); i++){
			System.out.println(listTypes.get(i).getLibelleType());
		}
		System.out.println("\n");
		System.out.println("Selectionner le type de plat ");

		Scanner scType = new Scanner(System.in);
		type = scType.nextLine();
		
		
		for( int i = 0 ; i< listTypes.size(); i++){
			if(listTypes.get(i).getLibelleType().equals(type)){
				
				typeVerif = true;
				typeIntTest = listTypes.get(i).getIdType();
				typeTest = listTypes.get(i).getLibelleType();
			}
			
		}
		
			
		if(typeVerif){
		monType = new Type (typeIntTest, typeTest);
		Recette uneRecette = new Recette(numero, tpPrep, tpCuis, lvl, nom, monType );
		listRecettes.add(uneRecette);
		
		System.out.println("\n"+"Maintenant selectionner les ingrédiants pour votre recettes ");
		do{
			Scanner scIng = new Scanner(System.in);
			//sleection de l ingrediant comparaison au table d ingred
			
		}
		while(!continue = );// de continue classic
		System.out.println("Votre recette a été créer");
		}
		else{
			System.out.println("Nous sommes navrés de vous informer qu'une erreur a été engendré"+"\n"+"Probleme de validation de recette ");
		}
	}
	
	public static void afficherRecette(){
		System.out.println("\n"+"Les recettes actuallement disponibles sont :" +"\n");
		for(int i = 0; i< listTypes.size(); i++){
			System.out.println(listTypes.get(i).getLibelleType());
		}
	}
}
