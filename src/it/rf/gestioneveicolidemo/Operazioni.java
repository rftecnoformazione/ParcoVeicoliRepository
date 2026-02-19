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
package it.rf.gestioneveicolidemo;

import java.util.Scanner;

public class Operazioni implements FunzionalitaSoftware{

	int numVeicoli=0;
	Scanner scan = new Scanner(System.in);
	char scelta='p';
	
	@Override
	public void caricamento(Veicolo[] vett) {
		
		System.out.println("Quale veicolo vuoi caricare?");
		System.out.println("1. Auto");
		System.out.println("2. Moto");
		System.out.println("3. Camion");
		scelta=scan.next().charAt(0);
		
		if(scelta=='1')
		{
			System.out.print("Inserisci il numero di telaio: ");
			String nTelaio=scan.next();
			for(int i=0; i<vett.length; i++)
			{
				if(nTelaio.equals(vett[i].nTelaio))
				{
					System.out.println("Numero Telaio già esistente");
					while(nTelaio.equals(vett[i].nTelaio))
					{
						System.out.println("Inserisci un altro numero telaio: ");
						nTelaio=scan.next();
					}
				}
			}
			System.out.print("Inserisci il colore: ");
			String colore=scan.next();
			System.out.print("Inserisci il numero delle ruote: ");
			 while(!scan.hasNextInt())
			   {
			    System.out.print("Inserisci un numero valido: ");
			    scan.next();
			   }
			int nRuote=scan.nextInt();
			double velocita=0;
			System.out.print("Inserisci il numero delle porte: ");
			 while(!scan.hasNextInt())
			   {
			    System.out.print("Inserisci un numero valido: ");
			    scan.next();
			   }
			int nPorte=scan.nextInt();
			
			boolean cabrio = false;
			int sceltaCabrio;

			do {
		     System.out.println("È una cabrio?");
		     System.out.println("1 = SI");
		     System.out.println("0 = NO");
			    while (!scan.hasNextInt()) {
			        System.out.println("Inserisci un numero valido!");
			        scan.next();
			    }

			    sceltaCabrio = scan.nextInt();

		     if (sceltaCabrio != 0 && sceltaCabrio != 1) {
		         System.out.println("Scelta non valida! Devi inserire 0 o 1.");
		     }

			} while (sceltaCabrio != 0 && sceltaCabrio != 1);

			cabrio = (sceltaCabrio == 1) ? true : false;

			Auto auto = new Auto(nTelaio, colore, nRuote, velocita, cabrio, nPorte);
			vett[numVeicoli]=auto;
			numVeicoli++;
		}
		
		if(scelta=='2')
		{
			System.out.print("Inserisci il numero di telaio: ");
			String nTelaio=scan.next();
			for(int i=0; i<vett.length; i++)
			{
				if(nTelaio.equals(vett[i].nTelaio))
				{
					System.out.println("Numero Telaio già esistente");
					while(nTelaio.equals(vett[i].nTelaio))
					{
						System.out.println("Inserisci un altro numero telaio: ");
						nTelaio=scan.next();
					}
				}
			}
			System.out.print("Inserisci il colore: ");
			String colore=scan.next();
			System.out.print("Inserisci il numero delle ruote: ");
			 while(!scan.hasNextInt())
			   {
			    System.out.print("Inserisci un numero valido: ");
			    scan.next();
			   }
			int nRuote=scan.nextInt();
			int velocità=0;
			
			boolean paravento;
			int sceltaParavento;

			do {
		     System.out.println("Ha il paravento?");
		     System.out.println("1 = SI");
		     System.out.println("0 = NO");
			    while (!scan.hasNextInt()) {
			        System.out.println("Inserisci un numero valido!");
			        scan.next();
			    }

			    sceltaParavento = scan.nextInt();

		     if (sceltaParavento != 0 && sceltaParavento != 1) {
		         System.out.println("Scelta non valida! Devi inserire 0 o 1.");
		     }

			} while (sceltaParavento != 0 && sceltaParavento != 1);

			paravento = (sceltaParavento == 1) ? true : false;
			
			boolean bauletto;
			int sceltaBauletto;

			do {
				System.out.println("Ha il bauletto?");
			    System.out.println("1 = SI");
			    System.out.println("0 = NO");
			    while (!scan.hasNextInt()) {
			        System.out.println("Inserisci un numero valido!");
			        scan.next();
			    }

			    sceltaBauletto = scan.nextInt();

		     if (sceltaBauletto != 0 && sceltaBauletto != 1) {
		         System.out.println("Scelta non valida! Devi inserire 0 o 1.");
		     }

			} while (sceltaBauletto != 0 && sceltaBauletto != 1);

			bauletto = (sceltaBauletto == 1) ? true : false;
			
			Moto moto = new Moto(nTelaio, colore, nRuote, velocità, paravento, bauletto);
			vett[numVeicoli]=moto;
			numVeicoli++;
		}
		
		if(scelta=='3')
		{
			System.out.print("Inserisci il numero di telaio: ");
			String nTelaio=scan.next();
			for(int i=0; i<vett.length; i++)
			{
				if(nTelaio.equals(vett[i].nTelaio))
				{
					System.out.println("Numero Telaio già esistente");
					while(nTelaio.equals(vett[i].nTelaio))
					{
						System.out.println("Inserisci un altro numero telaio: ");
						nTelaio=scan.next();
					}
				}
			}
			System.out.print("Inserisci il colore: ");
			String colore=scan.next();
			System.out.print("Inserisci il numero delle ruote: ");
			 while(!scan.hasNextInt())
			   {
			    System.out.print("Inserisci un numero valido: ");
			    scan.next();
			   }
			int nRuote=scan.nextInt();
			int velocità=0;
			
			boolean rimorchio;
			int sceltaRimorchio;

			do {
				System.out.println("Ha il rimorchio?");
			    System.out.println("1 = SI");
			    System.out.println("0 = NO");
			    while (!scan.hasNextInt()) {
			        System.out.println("Inserisci un numero valido!");
			        scan.next();
			    }

			    sceltaRimorchio = scan.nextInt();

		     if (sceltaRimorchio != 0 && sceltaRimorchio != 1) {
		         System.out.println("Scelta non valida! Devi inserire 0 o 1.");
		     }

			} while (sceltaRimorchio != 0 && sceltaRimorchio != 1);

			rimorchio = (sceltaRimorchio == 1) ? true : false;
			
			System.out.print("Inserisci il numero delgli assi: ");
			 while(!scan.hasNextInt())
			   {
			    System.out.print("Inserisci un numero valido: ");
			    scan.next();
			   }
			int nAssi=scan.nextInt();
			
			Camion camion = new Camion(nTelaio, colore, nRuote, velocità, rimorchio, nAssi);
			vett[numVeicoli]=camion;
			numVeicoli++;
		}
		
		if(scelta!='1' && scelta!='2' && scelta!='3')
		{
			System.out.println("Inserisci una scelta valida (1 - 2 - 3)");
		}
		
	}

	@Override
	public void stampa(Veicolo[] vettore) {
		
		for(int i=0; i<vettore.length; i++)
		{
			if(vettore[i] instanceof Auto)
			{
				Auto auto = (Auto) vettore[i];
				System.out.println("Numero di telaio: " + auto.nTelaio);
				System.out.println("Colore: " + auto.colore);
				System.out.println("Numero ruote: " + auto.nRuote);
				System.out.println("Velocità attuale: " + auto.velocita);
				System.out.println("Numero porte: " + auto.nPorte);
				if(auto.cabrio)
				{
					System.out.println("È cabrio");
				}
				else
				{
					System.out.println("Non è cabrio");
				}
			}
			if(vettore[i] instanceof Moto)
			{
				Moto moto = (Moto) vettore[i];
				System.out.println("Numero di telaio: " + moto.nTelaio);
				System.out.println("Colore: " + moto.colore);
				System.out.println("Numero ruote: " + moto.nRuote);
				System.out.println("Velocità attuale: " + moto.velocita);
				if(moto.paravento)
				{
					System.out.println("Ha il paravento");
				}
				else
				{
					System.out.println("Non ha il paravento");
				}
				if(moto.bauletto)
				{
					System.out.println("Ha il bauletto");
				}
				else
				{
					System.out.println("Non ha il bauletto");
				}
			}
			if(vettore[i] instanceof Camion)
			{
				Camion camion = (Camion) vettore[i];
				System.out.println("Numero di telaio: " + camion.nTelaio);
				System.out.println("Colore: " + camion.colore);
				System.out.println("Numero ruote: " + camion.nRuote);
				System.out.println("Velocità attuale: " + camion.velocita);
				if(camion.rimorchio)
				{
					System.out.println("Ha il rimorchio");
				}
				else
				{
					System.out.println("Non ha il rimorchio");
				}
				System.out.println("Numero assi: " + camion.nAssi);
			}
		}
		
	}

	@Override
	public Veicolo ricerca(Veicolo[] vettore, String nTelaio) {
		
		return null;
	}

	@Override
	public void modifica(Veicolo[] vettore, Veicolo v) {
		
		
	}

}
