package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float numero1 = 0;
		float numero2 = 0;
		
		System.out.print("Primer n�mero: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		numero2 = sc.nextFloat();
		
		System.out.println("N�MEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("N�mero 1: " + numero1);
		System.out.println("N�mero 2: " + numero2);
	}
}
