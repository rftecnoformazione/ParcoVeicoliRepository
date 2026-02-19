package it.rf.gestioneveicolidemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char scelta = 'g';
		Scanner l = new Scanner(System.in);
		
		while(scelta!='0')
		{
			System.out.println("Menu:");
			System.out.println("1 Inserimento");
			System.out.println("2 Stampa");
			System.out.println("3 Ricerca per n. telaio");
			System.out.println("4 Cerca x telaio e modifica colore");
			System.out.println("5 Fai accelerare un veicolo");
			System.out.println("0 Esci");
			scelta=l.next().charAt(0);
			
			if(scelta=='1')
			{
				
			}
			
			if(scelta=='2')
			{
				
			}
			
			if(scelta=='3')
			{
				
				
			}
			
			if(scelta=='4')
			{
				
			}
			
			if(scelta=='5')
			{
				
			}
			
			if(scelta=='0')
			{
				
			}
			
			if(scelta!='1' && scelta!='2' && scelta!='3' && scelta!='4' && scelta!='5' && scelta!='0')
			{
				System.out.println("Scelta non valida, seleziona tra quelle esistenti");
			}
		}
	}

}
