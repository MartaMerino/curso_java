package com.mipaquete;

public class EjemplosArrays {

	public static void main(String[] args) {

		int[] arrayEnteros;

		arrayEnteros = new int[5];
		arrayEnteros[0] = 7;
		arrayEnteros[1] = 9;
		arrayEnteros[2] = 11;
		arrayEnteros[3] = 12;
		arrayEnteros[4] = 1;

		for (int c = 0; c < arrayEnteros.length; c++) {
			arrayEnteros[c] = c * c;

			System.out.println("array(" + c + ") = " + arrayEnteros[c]);
			// System.out.println("array1 = " + arrayEnteros[1]);
			// System.out.println("array2 = " + arrayEnteros[2]);
			// System.out.println("array3 = " + arrayEnteros[3]);
			// System.out.println("array4 = " + arrayEnteros[4]);

		}
		float[] decimales = new float[5];
		for (int j = 0; j < decimales.length; j++) {
			decimales[j] = j / 3f;
			System.out.println("El tercio de " + j + " es = " + decimales[j]);
		}

		int otroArray[] = { 5, 10, 15, 20, 25 };
		for (int elemento : otroArray) {
			System.out.println("Elemento " + elemento);

		}

		String[] dias = { "Lunes, Martes, Miercoles, Jueves, Viernes, Sabado y Domingo." };
		for (String diasSemana : dias) {
			System.out.println("Los días de la semana son: " + diasSemana);
		}
		int numDia = 0;
		while (numDia < dias.length) {
			System.out.println(dias[numDia]);
			numDia++;
		}

		for (int d = 0; d < dias.length; d++) {
			String dia = dias[d];
			System.out.println(dia);
		}

	}

}
