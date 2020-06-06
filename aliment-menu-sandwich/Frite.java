public class Frite extends Aliment implements Vendable{
	private static int cpt=0; //compteur de frite
	private double prixsup; //prix en supplement
	
	public Frite(double prix, double prixsup){
		super(prix);
		this.prixsup=prixsup;
		cpt+=50;
	}
	public double getPrixSup(){
		return prixsup;
	}
	public String toString(){
		return " Frite ";
	}
	public int getCpt(){
		return cpt;
	}
	public void setCpt(){
		cpt--;
	}
	public void setCpt(int quantite){
		cpt=cpt+quantite ;
	}
	//static pour etre appeler ds le toString du fast food pr avoir le compteur 
	public static String stringCpt(){
		return "\n\t Frite :  "+cpt;
	}
}
