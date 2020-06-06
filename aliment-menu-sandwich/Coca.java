public class Coca extends Boisson{
	private static int cpt=0;
	public Coca( double prix, double prixsup){
		super(prix,prixsup);
		cpt+=50;
	}
	public String toString(){
		return super.toString()+"Coca " ;
	}
	public void setCpt(){
		cpt--;
	}
	public int getCpt(){
		return cpt;
	}
	public void setCpt(int quantite){
		cpt=cpt+quantite ;
	}
		public static String stringCpt(){
		return "\n\t Coca-Cola :  "+cpt;
	}
}
