
public abstract class Aliment  {
	private int idAliment;
	private String nomAliment;
	private double calories;
	
	public Aliment(int idAliment, String nomAliment, double calories) {
		super();
		this.idAliment = idAliment;
		this.nomAliment = nomAliment;
		this.calories = calories;
	}

	public int getIdAliment() {
		return idAliment;
	}

	public void setIdAliment(int idAliment) {
		this.idAliment = idAliment;
	}

	public String getNomAliment() {
		return nomAliment;
	}

	public void setNomAliment(String nomAliment) {
		this.nomAliment = nomAliment;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	
}
