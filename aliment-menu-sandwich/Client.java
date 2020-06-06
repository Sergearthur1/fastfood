import java.util.ArrayList ;
public class Client {
	private static int cptclient=0;
	private String nom;
	public Client(String nom){
		this.nom=nom;
		cptclient++;
	}
	public static int getcpt(){
		return cptclient;
	}


	public double commander(Menu m, Vendable supp){ 
		if((m.estCommandable()==true) && supp.getCpt()!=0 ){
			supp.setCpt();
				
			return  m.getprixdevente()+supp.getPrixSup();
		}
		else {	System.out.println("impossible aliment pas dispo");
			return 0.;
	
	}}

}

