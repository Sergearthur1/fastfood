public class Fromage extends Aliment implements Vendable{
	
	private static int cpt=0; //compteur de fromage
	private double prixsup; //prix en supplement


	public Fromage(double prix, double prixsup){
		super(prix);
		this.prixsup=prixsup;
		cpt=50; //cration dun caisse de 50 fromage
	}


	public String toString(){
		return "Fromage ";
	}


	public double getPrixSup(){
		return prixsup;
	}


	public int getCpt(){
		return cpt;
	}

	public void setCpt(){
		cpt=cpt-1;
	}

	public void setCpt(int quantite){
		cpt=cpt+quantite ;
	}

	public static String stringCpt(){
		return "\n\t Fromage :  "+cpt;
	}
}
