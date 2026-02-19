package it.rf.gestioneveicolidemo;

public class Veicolo implements FunzionalitaVeicoli{

	String nTelaio;
	String colore;
	int nRuote;
	double velocita;
	
	public Veicolo() {
		super();
	}

	public Veicolo(String nTelaio, String colore, int nRuote, double velocita) {
		super();
		this.nTelaio = nTelaio;
		this.colore = colore;
		this.nRuote = nRuote;
		this.velocita = velocita;
	}

	@Override
	public void accelera(Veicolo v) {	
		
	}

	@Override
	public void decelera(Veicolo v) {
		
	}
	
	
	
}
