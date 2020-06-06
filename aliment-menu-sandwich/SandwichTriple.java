import java.util.ArrayList ;
public class SandwichTriple extends Sandwich{
	private Viande v1;
	private Viande v2;
	private Viande v3;
	public SandwichTriple(Salade sa, Tomate to, Oignon oi, Pain pa, Viande vi1,Viande vi2,Viande vi3,double ps){
		super(sa,to,oi,pa,ps);
		v1=vi1;
		v2=vi2;
		v3=vi3;
	}

	public String toString(){
		return super.toString()+" Triple avec "+s.toString()+t.toString()+o.toString()+p.toString()+v1.toString()+v2.toString()+v3.toString() ;
	}
	public boolean estCommandable(){
		
		ArrayList<Aliment> liste=new ArrayList<Aliment>() ;
		
		liste.add((Aliment)s);
		liste.add((Aliment)t);
		liste.add((Aliment)o);
		liste.add((Aliment)p);
		liste.add((Aliment)v1);
		liste.add((Aliment)v2);

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
