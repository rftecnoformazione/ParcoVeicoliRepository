package it.rf.gestioneveicolidemo;

public class Moto extends Veicolo{
	 	
		boolean bauletto;
	    boolean paravento;

	    public Moto() {}	   

	    public Moto(String nTelaio, String colore, int nRuote, double velocita, boolean bauletto, boolean paravento) {
	        super(nTelaio, colore, nRuote, velocita);
	        this.bauletto = bauletto;
	        this.paravento = paravento;
	}
	   
	    @Override
		public void accelera(Veicolo v) {	
			v.velocita=velocita+30;
		}

		@Override
		public void decelera(Veicolo v) {
			v.velocita=velocita-10.5;
		}
}

