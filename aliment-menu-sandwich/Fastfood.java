import java.util.ArrayList ;
import java.util.Scanner ;
public class Fastfood{
	private int nbplaces ;
	private double budget;
	private	Tomate to=new Tomate(0.30);
	private	Oignon oi=new Oignon(0.5);
	private	Salade sa=new Salade(0.10);
	private	PainNormal pno =new PainNormal(0.5);
	private	PainTortilla pt=new PainTortilla(0.6);
	private	PainNan pn=new PainNan(1.0);
	private	Kebab k=new Kebab(2.5);
	private	Kefta ke=new Kefta(2.0);
	private	Poulet po=new Poulet(2.0);
	private	Frite f=new Frite(0,2);
	private	Coca co=new Coca(0.8,1.);
	private	IceTea it=new IceTea(0.8,1.);
	private Fromage fro=new Fromage(0.2,0.5);
	private Sandwich s;
	
	private Boisson b;
	
	// constructeur 
	public Fastfood(int nbp, double b){
		nbplaces=nbp;
		budget=b;
	}
	// choisi aleatoirement 1 menu 
	public Menu composeMenu(){
	
			
		int v=(int)(Math.random()*3);
		int p=(int)(Math.random()*3);
		int t=(int)(Math.random()*3) ; 
		
		Viande tabv[]={ke, k, po};
		int tabt[]={1,2,3};
		Pain tabp[]={pno,pn,pt};
		Sandwich s;
		
		//choisi aleatoiremen un sandwich
		if(t==0){
			
			s=new Sandwichsimple(sa, to, oi,tabp[p], tabv[v],5.5);
		}
		else if(t==1){
			
			s=new SandwichDouble(sa, to, oi,tabp[p],tabv[v], tabv[v],6.5);
		}
		else {
			
			s=new SandwichTriple(sa, to, oi,tabp[p],tabv[v],tabv[v], tabv[v],7.5);
		}
		

		//on choisi aleatoirement une boisson
		int randb=(int)(Math.random()*2);
		Boisson b;
		if(randb==0)
			b=co;
		else
			 b=it;

		Menu me=new Menu(s,f,b,5.);
		return me;
	} 


	//choisi aleatoirement 1supplement 

	public Vendable composeSupp(){
		Vendable tab[]={co,it,f,fro};
		int irand=(int)(Math.random()*4) ;
		if(irand==0)
			return tab[irand];
		else if(irand==1)
			return tab[irand];
		else if(irand==2)			
			return tab[irand];

		return tab[irand];
	}

	//rachete des aliments 
	public void approvisionnement(Aliment a, int quantité){
		a.setCpt(quantité);
		budget=budget- quantité*a.getPrix() ;
	}
	public void approvisionnementTOUT(int quantité){
		approvisionnement(to,quantité);
		approvisionnement(oi,quantité);
		approvisionnement(sa,quantité);
		approvisionnement(pno,quantité);
		approvisionnement(pt,quantité);
		approvisionnement(pn,quantité);
		approvisionnement(k,quantité);
		approvisionnement(ke,quantité);
		approvisionnement(po,quantité);
		approvisionnement(f,quantité);
		approvisionnement(co,quantité);
		approvisionnement(it,quantité);
		approvisionnement(fro,quantité);
	}
	public void approvisionnementAliment(int quantité, String str){
		if(str.equals("tout")){
			approvisionnementTOUT(quantité);
		} 
		if(str.equals("Tomate")){
			approvisionnement(to,quantité);
		}
		if(str.equals("Oignon")){
			approvisionnement(oi,quantité);
		}
		if(str.equals("Salade")){
			approvisionnement(sa,quantité);
		}
		if(str.equals("Pain Nan")){
			approvisionnement(pno,quantité);
		}
		if(str.equals("Pain Tortilla")){
			approvisionnement(pt,quantité);
		}
		if(str.equals("Pain Normal")){
			approvisionnement(pn,quantité);
		}
		if(str.equals("Kefta")){			
			approvisionnement(k,quantité);
		}
		if(str.equals("Kebab")){
			approvisionnement(ke,quantité);
		}
		if(str.equals("Poulet")){
			approvisionnement(po,quantité);
		}
		if(str.equals("Frite")){
			approvisionnement(f,quantité);
		}
		if(str.equals("Coca-Cola")){
			approvisionnement(co,quantité);
		}
		if(str.equals("IceTea")){
			approvisionnement(it,quantité);
		}
		if(str.equals("Fromage")){
			approvisionnement(fro,quantité);
		}
		
	}
	// commande : fais augmente le budget , baisse les stocks
	public void commande(Client c,Menu m, Vendable v){
		
		if(c instanceof Clientfidele){
			System.out.println("\n\t Un Client FIDELE a commandé un : "+m.toString()+" avec un supplément : "+v.toString()+"\n\n");
			budget+=c.commander(m,v);
		}
		else{
			System.out.println("\n\t Un Client a commandé un : "+m.toString()+" avec un supplément : "+v.toString()+"\n\n");
			budget+=c.commander(m,v);
		}
	}
	public double getBudget(){
		return budget;
	}

	// renvoi l'argent du restaurent et les stock 
	public String toString(){
		return "budget :"+budget+" \n"+"nombre de place dans le restaurant : "+nbplaces+"\n\t\n"+"quantité restante : \n"+Salade.stringCpt()+Oignon.stringCpt()+Tomate.stringCpt()+PainNormal.stringCpt()+PainTortilla.stringCpt()+PainNan.stringCpt()+Kefta.stringCpt()+Kebab.stringCpt()+Poulet.stringCpt()+Fromage.stringCpt()+Coca.stringCpt()+IceTea.stringCpt() ;
	} 
	

	// POSSIBILITÉS DE RACHETER des places dans le restaurant (=agrandissement)
	public void agrandir(int places, int prixparplace){
		nbplaces=nbplaces+places ;
		budget=budget-(places*prixparplace) ;
	}
	
	//renvoi nb places ds le restaurant pr que le random soit compris entre 0 et le nb de places (random nombre de client)
	public int getNbPlaces(){
		return nbplaces;
	 }

} 
	
	
