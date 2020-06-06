import java.util.ArrayList ;
public class Sandwichsimple extends Sandwich{
	private Viande v; 
	public Sandwichsimple(Salade sa, Tomate to, Oignon oi, Pain pa, Viande vi,double ps){
		super(sa,to,oi,pa,ps);
		v=vi;
	}

	public String toString(){
		return super.toString()+" Simple avec "+s.toString()+t.toString()+o.toString()+p.toString()+v.toString() ;
	}
	
	public boolean estCommandable(){
		
		ArrayList<Aliment> liste=new ArrayList<Aliment>() ;
		
		liste.add((Aliment)s);
		liste.add((Aliment)t);
		liste.add((Aliment)o);
		liste.add((Aliment)p);
		liste.add((Aliment)v);
	

		for(int i=0;i<liste.size();i++){
			if(liste.get(i).getCpt() !=0 ){
				liste.get(i).setCpt() ;
			}
			else {
			return false;
			}
		}
		return true;	
	}

}

