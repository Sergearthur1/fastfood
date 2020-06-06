public abstract class Viande extends Aliment{
	
	public Viande(double prix){
		super(prix);
	}
	public String toString(){
		return "Viande :";
	}
	public abstract void setCpt(int quantite);
}
