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
		
		if(v instanceof Moto) {
			v.velocita=v.velocita +30;
		}
		
		if(v instanceof Camion) 
		{ 
		 v.velocita=v.velocita +5;
			
		}
		
		if(v instanceof Auto)
		{
		 v.velocita=v.velocita +10;
		}
		 
	}

	@Override
	public void decelera(Veicolo v) {
		
	if (v instanceof Moto)	
	{
		
		v.velocita=v.velocita -30;
		
	
	}
	
	if (v instanceof Camion) 
	{
	
	 v.velocita=v.velocita -5;
	
	
	}
		
    if (v instanceof Auto) 
    
    {
    	v.velocita=v.velocita -10;
    }
    
	}
	
}
	
	
    
	
