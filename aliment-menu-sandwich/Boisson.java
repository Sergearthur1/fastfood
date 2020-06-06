public abstract class Boisson extends Aliment implements Vendable{
	protected double prixsup;

	public Boisson(double prix, double prixsup){
		super(prix);
		this.prixsup=prixsup;
		
	}
	public String toString(){
		return "Boisson ";
	}
	
	public double getPrixSup(){
		return prixsup;
	}

	public abstract int getCpt();
	public abstract void setCpt();
	public abstract void setCpt(int q); 
}
