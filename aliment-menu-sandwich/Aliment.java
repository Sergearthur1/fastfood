public abstract class Aliment{

	protected double prix ;
	
	public Aliment(double prix){
		this.prix=prix;
	
	}
	public double getPrix(){
		return prix;
	}
	
	public abstract void setCpt();
	public abstract int getCpt() ;
	public abstract void setCpt(int q);
	
}

