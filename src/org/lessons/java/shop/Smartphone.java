package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private String codiceIMEI;
	private int quantitaMemoria;
	
	
	public Smartphone(String nome, String descrizione, double prezzo, int iva, String codiceIMEI, int quantitaMemoria) {
		
		super(nome, descrizione, prezzo, iva);
		
		setCodiceIMEI(codiceIMEI);
		setQuantitaMemoria(quantitaMemoria);
	}
	
	
	public String getCodiceIMEI() {
		return codiceIMEI;
	}
	public void setCodiceIMEI(String codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}
	public int getQuantitaMemoria() {
		return quantitaMemoria;
	}
	public void setQuantitaMemoria(int quantitaMemoria) {
		this.quantitaMemoria = quantitaMemoria;
	}
	
	
	@Override
	public String toString() {

		return "\n------------------\n"
				+ "Smartphone\n" + super.toString() + "\n"
				+ "Codice IMEI: " + getCodiceIMEI() + "\n"
				+ "Quantità Memoria: " + getQuantitaMemoria()
				+"\n------------------";
	}
}
