import java.util.ArrayList;


public class Recette {
	private int idRecette, tempsPreparation, tempsCuisson, niveauDifficulte;
	private String nomRecette;
	private ArrayList<Aliment> listAliments;
	private Type typerecette;
	
	public Recette(int idRecette, int tempsPreparation, int tempsCuisson,
			int niveauDifficulte, String nomRecette, Type typerecette) {
		super();
		this.idRecette = idRecette;
		this.tempsPreparation = tempsPreparation;
		this.tempsCuisson = tempsCuisson;
		this.niveauDifficulte = niveauDifficulte;
		this.nomRecette = nomRecette;
		this.listAliments =  new ArrayList<Aliment>();
		this.typerecette = typerecette;
	}

	public int getIdRecette() {
		return idRecette;
	}

	public void setIdRecette(int idRecette) {
		this.idRecette = idRecette;
	}

	public int getTempsPreparation() {
		return tempsPreparation;
	}

	public void setTempsPreparation(int tempsPreparation) {
		this.tempsPreparation = tempsPreparation;
	}

	public int getTempsCuisson() {
		return tempsCuisson;
	}

	public void setTempsCuisson(int tempsCuisson) {
		this.tempsCuisson = tempsCuisson;
	}

	public int getNiveauDifficulte() {
		return niveauDifficulte;
	}

	public void setNiveauDifficulte(int niveauDifficulte) {
		this.niveauDifficulte = niveauDifficulte;
	}

	public String getNomRecette() {
		return nomRecette;
	}

	public void setNomRecette(String nomRecette) {
		this.nomRecette = nomRecette;
	}

	public ArrayList<Aliment> getListAliments() {
		return listAliments;
	}

	public void setListAliments(ArrayList<Aliment> listAliments) {
		this.listAliments = listAliments;
	}

	public Type getTyperecette() {
		return typerecette;
	}

	public void setTyperecette(Type typerecette) {
		this.typerecette = typerecette;
	}
	
	
}
