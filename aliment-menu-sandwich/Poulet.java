public class Poulet extends Viande{
	private static int cpt=0; //COMPTEUR DE poulet
	public Poulet(double prix){
		super(prix);
		cpt+=50;
	}	
	public String toString(){
		return super.toString()+" Poulet ";
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
		return "\n\t Poulet :  "+cpt;
	}
}
