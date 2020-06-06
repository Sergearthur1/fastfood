public class Kefta extends Viande{
	private static int cpt=0; //COMPTEUR DE KEFTA
	public Kefta(double prix){
		super(prix);
		cpt+=50;
	}	
	public String toString(){
		return " Kefta ";
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
		return "\n\t Kefta :  "+cpt;
	}

 }
