public class Salade extends Aliment{
	private static int cpt=0; //compteur de salade
	public Salade(double prix){
		super(prix);
		cpt+=50;
	}
	public String toString(){
		return "Salade ";
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
	public static String stringCpt(){
		return "\n\t Salade :  "+cpt;
	}
}
		

