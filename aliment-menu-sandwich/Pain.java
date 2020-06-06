public abstract class Pain extends Aliment{
	public Pain(double prix){
		super(prix);
		
	}
	public String toString(){
		return "Pain" ;
	}
	public abstract void setCpt(int q);
} 
