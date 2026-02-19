package it.rf.gestioneveicolidemo;

public class Camion extends Veicolo{
	public boolean rimorchio;
	public int nAssi;
	public Camion(boolean rimorchio, String assi) {}
	
	 public Camion(String nTelaio, String colore, int nRuote, double velocita, boolean rimorchio,
			 int nAssi) {
	        // 1. chiamata parente Veicolo
	        super(nTelaio, colore, nRuote, velocita);
	        
	        // 2 nuovi assegni sotto classse
	        	this.rimorchio = rimorchio;
	        	this.nAssi = nAssi;
	    }
	 public Camion() {
	
	}
	 
	}

