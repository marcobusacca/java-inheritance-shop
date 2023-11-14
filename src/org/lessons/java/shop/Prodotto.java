package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	
	public Prodotto(String nome, String descrizione, double prezzo, int iva) {
		
		Random rnd = new Random();
		setCodice(rnd.nextInt(1, 1000));
		
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	
	// GETTER & SETTER: CODICE
	public int getCodice() {
		
		return codice;
	}
	private void setCodice(int codice) {
		
		this.codice = codice;
	}
	
	// GETTER & SETTER: NOME
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	// GETTER & SETTER: DESCRIZIONE
	public String getDescrizione() {
		
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		
		this.descrizione = descrizione;
	}
	
	// GETTER & SETTER: PREZZO
	public double getPrezzo() {
		
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		
		this.prezzo = prezzo;
	}
	
	// GETTER & SETTER: IVA
	public int getIva() {
		
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	
	public String getPrezzoBase() {
		
		return String.format("%.02f", getPrezzo()) + "€";
	}
	public String getPrezzoPieno() {
		
		return String.format("%.02f", getPrezzo() * (100 + iva) / 100) + "€";
	}
	public String getCodiceFormattato() {
		
		return String.format("%08d", getCodice());
	}
	public String getNomeEsteso() {
		
		return getCodiceFormattato() + "-" + getNome();
	}
	
	
	@Override
	public String toString() {
		
		return "--------------------\n"
				+ "Prodotto: \n"
				+ "Codice: " + getCodiceFormattato() + "\n"
				+ "Nome: " + getNome() + "\n"
				+ "Descrizione: " + getDescrizione() + "\n"
				+ "Prezzo: " + getPrezzo() + "\n"
				+ "Iva: " + getIva() + "\n"
				+ "--------------------";
	}
}
