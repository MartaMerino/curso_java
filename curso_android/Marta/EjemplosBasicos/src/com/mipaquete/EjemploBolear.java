package com.mipaquete;

public class EjemploBolear {

	public static void funcionPrincipal() {
		
		System.out.println("Ejemplos Booleanos");
		
		int a = 0;
		int b = 0;
		operadoresComparacion(a, b);
	}

		public static void operadoresComparacion(int a, int b) {
		
		if (a == b) {
			System.out.println("Son iguales");
		}
		if (a < b) {
			System.out.println(a + " es menos que " + b);
		} else {	
			System.out.println(a + " no es menor que " + b);
		}
		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else {
			System.out.println(a + " no es mayor que " + b);
		}
		if (a != b) {
			System.out.println(a + " es diferente que " + b);
		} else {
			System.out.println(a + " es igual que " + b);
		
	}
		}
}
