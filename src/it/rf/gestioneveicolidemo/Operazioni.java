import java.util.Scanner;

public class Operazioni implements FunzionalitaSoftware{

	Scanner scan = new Scanner(System.in);
	int indiceAttuale;
			
			
	@Override
	public Veicolo ricerca(Veicolo[] vettore, String nTelaio) {
		for(int i = 0;i<indiceAttuale; i++) {
			
			if(vett[i].nTelaio==nTelaio) {
				return vett[i];
			}
			
		}
		return null;
	}
	
	
	
	public void modifica (Veicolo vett[], Veicolo v) {
		
		/* ========================FUNZIONE SOLO COLORE===========================*/
		
		
		System.out.print("Inserisci il nuovo colore: ");
		v.colore = scan.next();
		
		
		/*===================================FUNZIONE COMPLETA============================*/
		
		
		/*
		 
		 
		String scelta;
		Veicolo appoggio = new Veicolo();
		
		
		
		System.out.print("Cosa vuoi modificare? ");
		scelta = scan.next();
		
		
		//===========================================MOTO===========================================
		
		if(v instanceof Moto) {
			Moto vedoMoto = (Moto)v;
			
			if(scelta.equals("1")) {
				while(appoggio!=null){
				
					System.out.println("Inserisci il nuovo numero di telaio: ");
					v.nTelaio = scan.next();
					appoggio=ricerca(vett, v.nTelaio);
				
				}
			}
			
			else if(scelta.equals("2")) {
				System.out.println("Inserisci il nuovo colore: ");
				v.colore = scan.next();
			}
			
			else if(scelta.equals("3")) {
				System.out.println("Inserisci il nuovo numero di ruote: ");
				v.nRuote = scan.next();
			}
			
			else if(scelta.equals("4")) {
				
				System.out.println("Inserisci un nuovo valore per il bauletto (true/false): ");
				boolean a = scan.nextBoolean();
				v.setbauletto(a);
			}
			
			else if(scelta.equals("5")) {
				System.out.println("Inserisci un nuovo valore per il bauletto (true/false): ");
				boolean a = scan.nextBoolean();
				v.setparavento(a);
			}
			else {
				System.out.print("ERRORE");
			}
			
		}
		
		//==================================AUTO=============================================
		
		else if(v instanceof Auto) {
			Auto vedoMoto = (Auto)v;
			
			if(scelta.equals("1")) {
				while(appoggio!=null){
				
					System.out.println("Inserisci il nuovo numero di telaio: ");
					v.nTelaio = scan.next();
					appoggio=ricerca(vett, v.nTelaio);
				
				}
			}
			
			else if(scelta.equals("2")) {
				System.out.println("Inserisci il nuovo colore: ");
				v.colore = scan.next();
			}
			
			else if(scelta.equals("3")) {
				System.out.println("Inserisci il nuovo numero di ruote: ");
				v.nRuote = scan.next();
			}
			
			else if(scelta.equals("4")) {
				
				System.out.println("Inserisci un nuovo valore per il cabrio (true/false): ");
				boolean a = scan.nextBoolean();
				v.setcabrio(a);
			}
			
			else if(scelta.equals("5")) {
				System.out.println("Inserisci un nuovo valore per  il numero di porte: ");
				v.nPorte = scan.nextInt();
			}
			else {
				System.out.print("ERRORE");
			}
			
		}
		
		//===========================================Camion========================================
		
		else if(v instanceof Camion) {
			Camion vedoMoto = (Camion)v;
			
			if(scelta.equals("1")) {
				while(appoggio!=null){
				
					System.out.println("Inserisci il nuovo numero di telaio: ");
					v.nTelaio = scan.next();
					appoggio=ricerca(vett, v.nTelaio);
				
				}
			}
			
			else if(scelta.equals("2")) {
				System.out.println("Inserisci il nuovo colore: ");
				v.colore = scan.next();
			}
			
			else if(scelta.equals("3")) {
				System.out.println("Inserisci il nuovo numero di ruote: ");
				v.nRuote = scan.next();
			}
			
			else if(scelta.equals("4")) {
				
				System.out.println("Inserisci un nuovo valore per il rimorchio (true/false): ");
				boolean a = scan.nextBoolean();
				v.setrimorchio(a);
			}
			
			else if(scelta.equals("5")) {
				System.out.println("Inserisci un nuovo valore per  il numero di assi: ");
				v.nAssi = scan.nextInt();
			}
			else {
				System.out.print("ERRORE");
			}
		}
		
		else {
			System.out.print("ERRORE");
		}
		
		
		
		*/
		
		
	}


	
	
	
	

	@Override
	public void caricamento(Veicolo[] vettore) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void stampa(Veicolo[] vettore) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
}
