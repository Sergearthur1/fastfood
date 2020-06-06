import java.util.Scanner ;

public class TestFastfood{

	public static void main(String[] args){

		Fastfood f=new Fastfood(20,1000);

		System.out.println("\n\t\t\t DEBUT DE LA JOURNEE \n "+f.toString());

		

		Scanner sc=new Scanner(System.in);	 //pour le scanf
		Scanner scannint=new Scanner(System.in);
		String str="a";
		int nbplace;
		int quant;
		while (str.equals("a")){

		
			Clientfidele cf1=new Clientfidele("Client fidele 1");
			f.commande(cf1,f.composeMenu(),f.composeSupp());
			Clientfidele cf2=new Clientfidele("Client fidele 2");
			f.commande(cf2,f.composeMenu(),f.composeSupp());
			Clientfidele cf3=new Clientfidele("Client fidele 3");
			f.commande(cf3,f.composeMenu(),f.composeSupp());
			Clientfidele cf4=new Clientfidele("Client fidele 4");
			f.commande(cf4,f.composeMenu(),f.composeSupp());
			
		
				
			int nbClient=(int)(Math.random()*(f.getNbPlaces()))-4;
			System.out.println(nbClient+" clients ont commandé aujourd'hui" );
		
			for(int i=0;i<nbClient;i++){
				Client c=new Client("Chef");
				f.commande(c,f.composeMenu(),f.composeSupp());
				
			}

			System.out.println("\n\t\t\t FIN DE LA JOURNEE \n "+f.toString());
			
			//possibilité d'agrandir le resto pr avoir plus de client et de reaprovisonner les stocks
		
			System.out.println("Pour agrandir le resto tappezle nombre de places que vous voulez ajouter sinon tappez 0");
			
			nbplace=scannint.nextInt();	 
			f.agrandir(nbplace, 200);
			do{
				System.out.println("taper le nom de l'aliment a reaprovisioner ou 'tout' pour tout réaprovisionner, taper end pour passer a la suite");
				str=sc.nextLine();
				System.out.println("taper la quantité que vous voulez rajouter a l'aliment");
				quant=scannint.nextInt();
				f.approvisionnementAliment(quant,str);
			}while(!str.equals("end"));
			System.out.println("saisissez a pour passer a la journee suivante sinon saisissez autre chose");
			str=sc.nextLine();
			





		}
			
	
			

	
			


			
	
		
		
	



	}
}


		
