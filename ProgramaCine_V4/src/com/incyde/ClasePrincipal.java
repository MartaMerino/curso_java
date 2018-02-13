package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
	static float capital;
	static float precio = 7.5f;
	static int horaIda;
	static int horaPase_1 = 19;
	static int horaPase_2 = 21;
	static int horaPase_3 = 23;
	static int horaRecomendada;
	static Scanner teclado;

	public static void main(String[] args) {
		boolean resultadoCine;
		String siSalir;
		teclado = new Scanner(System.in);
		System.out.println("Programa Cine V4");
		do {
		
		pedirDatos();
		resultadoCine = comprobarSiVamosAlCine();
		mostrarResultado(resultadoCine);
		System.out.println("Desea continuar? (s/n)");
		teclado.nextLine();
		siSalir = teclado.nextLine();
		} while (siSalir.equals("s") || siSalir.equals("S"));
		teclado.close();
		System.out.println("fin del programa");
	}

	public static void pedirDatos() {
		System.out.println("Introduzca su dinero");
		teclado = new Scanner(System.in);
		capital = teclado.nextFloat();

		System.out.println("Introduzca hora");

		horaIda = teclado.nextInt();
		teclado.close();
		return;

	}

	public static boolean comprobarSiVamosAlCine() {
		if (capital >= precio) {
			if (horaIda >= horaPase_1 - 1 && horaIda <= horaPase_1) {
				horaRecomendada = horaPase_1;
				return true;
			}

			else if (horaIda >= horaPase_2 - 1 && horaIda <= horaPase_2) {
				horaRecomendada = horaPase_2;
				return true;
			}
			else if (horaIda >= horaPase_3 - 1 && horaIda <= horaPase_3) {
				return true;
			}
		}
		return false;

	}

	public static void mostrarResultado(boolean resultado) {

		if (resultado == true) {
			System.out.println("La hora recomendada es " + horaRecomendada);

		} else {
			System.out.println("No podemos ir al cine");
		}

	}
}