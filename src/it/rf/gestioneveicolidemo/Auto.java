package it.rf.gestioneveicolidemo;

public class Auto extends Veicolo{
	
	boolean cabrio;
	int nPorte;
	
	public Auto() {
		super();
		
	}
	
	public Auto(String nTelaio, String colore, int nRuote, double velocita, boolean cabrio, int nPorte) {
		super(nTelaio, colore, nRuote, velocita);
		this.cabrio=cabrio;
		this.nPorte=nPorte;
	}
	

	
}

