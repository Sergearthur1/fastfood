public class PainNan extends Pain{
	private static int cpt=0; //COMPTEUR DEnan
	public PainNan(double prix){
		super(prix);
		cpt+=50;
	}	
	public String toString(){
		return super.toString()+"Nan ";
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
		return "\n\t Pain Naan :  "+cpt;
	}

 }
	
