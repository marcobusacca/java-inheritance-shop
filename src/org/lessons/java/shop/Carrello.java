package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Prodotto[] prodotti = new Prodotto[100];
		
		int prodottiIndex = 0;
		
		while (true) {
			
			System.out.println("Che prodotto vuoi inserire? ---> (smartphone | televisore | cuffie)");
			String input = in.nextLine().toLowerCase();
			
			
			if (input.equals("smartphone") || input.equals("televisore") || input.equals("cuffie")) {
				
				System.out.print("\nInserisci il nome: ");
				String strNome = in.nextLine();
				
				System.out.print("Inserisci la descrizione: ");
				String strDescrizione = in.nextLine();
				
				System.out.print("Inserisci il prezzo: ");
				String strPrezzo = in.nextLine();
				double prezzo = Double.valueOf(strPrezzo);
				
				System.out.print("Inserisci l'IVA: ");
				String strIva = in.nextLine();
				int iva = Integer.valueOf(strIva);
				
				
				if (input.equals("smartphone")) {
					
					System.out.print("Inserisci il Codice IMEI: ");
					String strCodiceIMEI = in.nextLine();
					
					System.out.print("Inserisci la Quantità della Memoria: ");
					String strQuantitaMemoria = in.nextLine();
					int quantitaMemoria = Integer.valueOf(strQuantitaMemoria);

					
					Smartphone s = new Smartphone(strNome, strDescrizione, prezzo, iva, strCodiceIMEI, quantitaMemoria);
					
					prodotti[prodottiIndex] = s;
					prodottiIndex++;
					
				} else if (input.equals("televisore")) {
					
					System.out.print("Inserisci le dimensioni in pollici: ");
					String strDimensioni = in.nextLine();
					int dimensioni = Integer.valueOf(strDimensioni);
					
					System.out.print("È una Smart TV? (si | no): ");
					String strSmart = in.nextLine().toLowerCase();
					boolean smart = false;
					
					if (strSmart.equals("si")) {
						smart = true;
					}
					
					
					Televisori t = new Televisori(strNome, strDescrizione, prezzo, iva, dimensioni, smart);
					
					prodotti[prodottiIndex] = t;
					prodottiIndex++;
					
				} else if (input.equals("cuffie")) {
				
					System.out.print("Inserisci il colore: ");
					String strColore = in.nextLine();
					
					System.out.print("Sono cuffie Wireless o Cablate? (wireless | cablate): ");
					String strWireless = in.nextLine().toLowerCase();
					
					boolean wireless = true;
					boolean cablate = false;
					
					if (strWireless.equals("cablate")) {
						
						wireless = false;
						cablate = true;
					}
					
					
					Cuffie c = new Cuffie(strNome, strDescrizione, prezzo, iva, strColore, wireless, cablate);
					
					prodotti[prodottiIndex] = c;
					prodottiIndex++;
				}
				
				System.out.print("\nVuoi inserire un altro elemento? (si | no): ");
				String finalInput = in.nextLine().toLowerCase();
				
				if (finalInput.equals("no")) {
					break;
				}
			}
		}

		for (int i = 0; i < prodottiIndex; i++) {
			
			System.out.println(prodotti[i]);
		}
		
		System.out.print("\nPossiedi una carta fedeltà? (si | no): ");
		String strCartaFedelta = in.nextLine().toLowerCase();
		
		double sum = 0;
		
		if (strCartaFedelta.equals("si")) {
			
			for (int i = 0; i < prodottiIndex; i++) {
				
				Prodotto prodotto = prodotti[i];
				
				sum += prodotto.getPrezzoScontato();
			}
			
		} else {
			
			for (int i = 0; i < prodottiIndex; i++) {
				
				Prodotto prodotto = prodotti[i];
				
				sum += prodotto.getPrezzoCompleto();
			}
		}
		
		in.close();
		
		System.out.println("Totale carrello: " + String.format("%.02f", sum) + "€");
	}
}
