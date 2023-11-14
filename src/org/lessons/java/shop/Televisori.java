package org.lessons.java.shop;

public class Televisori extends Prodotto {

	private int dimensioni;
	private boolean smart;
	
	
	public Televisori(String nome, String descrizione, double prezzo, int iva, int dimensioni, boolean smart) {
		
		super(nome, descrizione, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	}
	
	
	public int getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public double getPrezzoScontato() {
		
		if (!isSmart()) {
			return getPrezzoCompleto() * (100 - 10) / 100;
		}
		
		return getPrezzoCompleto() * (100 - 2) / 100;
	}
	
	
	@Override
	public String toString() {

		return "\n------------------\n"
				+ "Televisore\n" + super.toString() + "\n"
				+ "Dimensioni: " + getDimensioni() + "\n"
				+ "Smart TV: " + (isSmart() ? "si" : "no")
				+"\n------------------";
	}
}
