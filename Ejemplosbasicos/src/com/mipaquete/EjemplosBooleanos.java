package com.mipaquete;

public class EjemplosBooleanos {

	public static void funcionPrincipal() {
		System.out.println("ejemplos booleanos");

		int a = 3;
		int b = 3;
		operadoresComparacion(a, b); 
    }
	public static void operadoresComparacion(int a, int b) {
		if (a == b) {
			System.out.println(a + " son iguales " + b);
		}
		if (a < b)
			System.out.println(a + " menos que " + b);
		if (a > b)
			System.out.println(a + " mayor que " + b);
		if (a >= b)
			System.out.println(a + " mayor o igual que " + b);
		if (a <= b)
			System.out.println(a + " menor o igual que " + b);
		if (a != b)
			System.out.println(a + " es distinto que " + b);
	}


}
