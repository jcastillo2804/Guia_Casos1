package com.senati.eti;

// Importar la librer�a para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// Instancia a la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarar variable
		// tipo nombre_variable = valor;
		int num = 0;
		
		System.out.print("Ingrese n�mero: ");
		num = sc.nextInt();
		
		// Concatenar la variable
		System.out.println("N�mero ingresado: " + num);
	}
}
