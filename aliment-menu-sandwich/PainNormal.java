public class PainNormal extends Pain{
	private static int cpt=0; //COMPTEUR DE pain normal
	public PainNormal(double prix){
		super(prix);
		cpt+=50;
	}
	public String toString(){
		return super.toString()+" Normal " ;
	}
	public int getCpt(){
		return cpt;
	}
	public void setCpt(){ 
		cpt--;//lorsque quelqun comande 
	}
	public void setCpt(int quantite){
		cpt=cpt+quantite ;
	}
	public static String stringCpt(){
		return "\n\t Pain Normal :  "+cpt;
	}

 }
