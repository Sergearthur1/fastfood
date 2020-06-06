public class IceTea extends Boisson{
	private static int cpt=0;
	public IceTea(double prix, double prixsup){
		super(prix,prixsup);
		cpt+=50; // cration dune caisse de 5O Ice Tea;
	}
	public String toString(){
		return super.toString()+"IceTea ";
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
		return "\n\t IceTea :  "+cpt;
	}
}
