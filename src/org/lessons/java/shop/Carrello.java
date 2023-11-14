package org.lessons.java.shop;

public class Carrello {

	public static void main(String[] args) {
		
		
		Smartphone s = new Smartphone("smartphone", "descrizione", 10, 22, "11212212122121", 10);
		
		System.out.println(s);
		
		
		Televisori t = new Televisori("televisore", "descrizione", 20, 22, 24, false);
		
		System.out.println(t);
		
		
		Cuffie c = new Cuffie("cuffie", "descrizione", 20, 22, "blu", false, true);
		
		System.out.println(c);
	}
}
