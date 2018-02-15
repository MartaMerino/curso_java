package com.incyde;

public class Principal {
	
	public static void main(String[] args) {
		Cuadrado cuadradoMarta = new Cuadrado();
		cuadradoMarta.lado = 2f;
		System.out.println("El perimetro es " + cuadradoMarta.perimetro());
		System.out.println("El area es " + cuadradoMarta.area());
		System.out.println("Dibujando " + cuadradoMarta.toString());
		
		
	}
	
}
