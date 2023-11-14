package org.lessons.java.shop;

public class Cuffie extends Prodotto {

	private String colore;
	private boolean wireless;
	private boolean cablate;
	
	
	public Cuffie(String nome, String descrizione, double prezzo, int iva, String colore, boolean wireless, boolean cablate) {
		
		super(nome, descrizione, prezzo, iva);
		
		setColore(colore);
		setWireless(wireless);
		setCablate(cablate);
	}
	
	
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	public boolean isCablate() {
		return cablate;
	}
	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}
	
	
	@Override
	public double getPrezzoScontato() {
		
		if (isCablate()) {
			return getPrezzoCompleto() * (100 - 7) / 100;
		}
		
		return getPrezzoCompleto() * (100 - 2) / 100;
	}
	
	
	@Override
	public String toString() {

		return "\n------------------\n"
				+ "Cuffie\n" + super.toString() + "\n"
				+ "Colore: " + getColore() + "\n"
				+ "Wireless: " + (isWireless() ? "si" : "no") + "\n"
				+ "Cablate: " + (isCablate() ? "si" : "no")
				+"\n------------------";
	}
}
