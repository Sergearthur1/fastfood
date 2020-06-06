import java.util.ArrayList ;
public class Menu{
	private Sandwich s;
	private Frite f;
	private Boisson b;
	private static int cptmenusimple=0;	//compteur de menu vendu 
	private double prixmenu;
	
	public Menu(Sandwich sa,Frite fr,Boisson bo,double pm){
		s=sa;
		b=bo;
		f=fr;
		prixmenu=pm;
		cptmenusimple++;
	}
	public double getprixdevente(){
		return prixmenu ;
	}

	public String toString(){
		return "Menu composé d'un "+s.toString()+" et de "+f.toString()+" "+b.toString() ;
	}
	
	//méthode utilisé seulement pour la methode commander dans classe client
	public boolean estCommandable(){
		
		if(s.estCommandable() && (f.getCpt()!=0) && (b.getCpt()!=0)){
						
			f.setCpt();
			b.setCpt();			
			return true ;
		}
	System.out.println("probleme stock vide");
	return false;
	}
	
}
