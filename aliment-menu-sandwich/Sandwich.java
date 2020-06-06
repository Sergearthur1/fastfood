import java.util.ArrayList ;
public abstract class Sandwich {
	protected Salade s;
	protected Tomate t;
	protected Oignon o;
	protected Pain p;
	private final double prixSandwich;
	public Sandwich(Salade sa, Tomate to, Oignon oi, Pain pa, double ps){
	
		s=sa;
		t=to;
		o=oi;
		p=pa;
		prixSandwich=ps;
	}
	public double getPrixSandwich(){
		return prixSandwich;
	}
	public String toString(){
		return "Sandwich ";
	}
	
	public abstract boolean estCommandable(); 


}
