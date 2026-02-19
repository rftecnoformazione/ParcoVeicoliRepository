package it.rf.gestioneveicolidemo;

public interface FunzionalitaSoftware {

	public void caricamento(Veicolo []vettore);
	public void stampa(Veicolo []vettore);
	public Veicolo ricerca(Veicolo []vettore, String nTelaio);
	public void modifica(Veicolo []vettore, Veicolo v);
	
}
