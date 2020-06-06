import java.util.ArrayList;
public class SandwichDouble extends Sandwich{
	private Viande v1;
	private Viande v2;
	public SandwichDouble(Salade sa, Tomate to, Oignon oi, Pain pa, Viande vi1,Viande vi2,double ps){
		super(sa,to,oi,pa,ps);
		v1=vi1;
		v2=vi2;
		
	
	}
	public String toString(){
		return super.toString()+"Double avec "+s.toString()+t.toString()+o.toString()+p.toString()+v1.toString()+v2.toString() ;
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
			System.out.println("probleme de stock pr le sandwich");
			return false;
			}
		}
		return true;	
	}





}
