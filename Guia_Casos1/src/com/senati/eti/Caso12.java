package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		
		// substring(pos_ini, pos_fin);
		String pl1 = frase.substring(0, 7);
		String pl2 = frase.substring(11, 21);
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Frase.........: " + frase);
		System.out.println("Palabra 1.....: " + pl1);
		System.out.println("Palabra 2.....: " + pl2);
	}
}
