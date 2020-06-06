public class Oignon extends Aliment{
	private static int cpt=0; //compteur de oignon
	public Oignon(double prix){
		super(prix);
		cpt+=50;
	}
	public String toString(){
		return " Oignon ";
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
		return "\n\t Oignon :  "+cpt;
	}

}
