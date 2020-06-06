public class Tomate extends Aliment{
	private static int cpt=0; //compteur de tomate
	public Tomate(double prix){
		super(prix);
		cpt+=50;
	}
	public String toString(){
		return " Tomate ";
	}
	public int getCpt(){
		return cpt ;
	}
	public void setCpt(){
		cpt--;
	}
	public void setCpt(int quantite){
		cpt=cpt+quantite ;
	}
	public static String stringCpt(){
		return "\n\t Tomate :  "+cpt;
	}
}
		
