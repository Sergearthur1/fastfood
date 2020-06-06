public class Clientfidele extends Client{
	private static int cptclientf=0;
	private int nbcommande=0;
	public Clientfidele(String nom){
		super(nom);
		cptclientf++;
	}
	public static int getcpt(){
		return cptclientf;
	}
	public String toString(){
		return super.toString()+"est fidèle a une reduction au bout de la 5eme commande" ;
	}

	public double commander(Menu m, Vendable supp){ 
		
		nbcommande++ ;
		if((m.estCommandable()==true) && supp.getCpt()!=0 ){
			supp.setCpt();
			if(nbcommande==5){
				System.out.println("a une reduction de 50%");
				return 	(m.getprixdevente()+supp.getPrixSup())/2;
			}else{
				return  m.getprixdevente()+supp.getPrixSup();
			}
		}
		else {	System.out.println("impossible aliment pas dispo");
			return 0.;
	
		}
	}


}
