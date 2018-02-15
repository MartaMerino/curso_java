package com.mipaquete;

public class Ejemplos_Funciones {

	public static void main(String[] args) {	
		
		System.out.println("Ejemplos_Funciones");
		
		// Empezando
		int x = 8;
		int y = 10;
		
		int resultadoSuma = sumarNumeros(x, y);
		int resultadoResta = restarNumeros(x, y);
		int resultadoPotencia = multiplicarNumeros(x, y);
				
		System.out.println("Resultado Suma = " + resultadoSuma);
		System.out.println("Resultado Potencia = " + resultadoPotencia);
		System.out.println("Resultado Resta = " + resultadoResta);
		System.out.println("Resultado Elevar = " + alCuadrado(6));
		System.out.println("Resultado Elevar Cubo = " + alCubo(5));
	
	}
	
	public static double alCubo(int parametro) {
		double result = Math.pow(parametro, 3);
		return result;
	}
	
	public static int alCuadrado(int v) {
		int resultado = v * v;
		return resultado;
	}
		
	public static int multiplicarNumeros(int valor_1, int valor_2) {
		return valor_1 * valor_2;
	}

	public static int restarNumeros(int valor_2, int valor_1) {
		return valor_1 - valor_2;
	}

	public static int sumarNumeros(int valor_1, int valor_2) {
		return valor_1 + valor_2;
	
	}
		
		
		
		
		
		
		
		
		
		
		
	

}
