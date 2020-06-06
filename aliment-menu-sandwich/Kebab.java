public class Kebab extends Viande{
	private static int cpt=0; //COMPTEUR DE KEbab
	public Kebab(double prix){
		super(prix);
		cpt+=50;
	}	
	public String toString(){
		return " Kebab ";
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
		return "\n\t Kebab :  "+cpt;
	}
 }
