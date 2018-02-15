package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {

	static float capital;
	static Scanner teclado;
	static float horaIda;
	static float horaRecomendada;
	static float horaLlegada;
	static float peliculaEscojida;
	static float horaDeseada;
	static float horarioCorrecto;				//Se crean unos valores estaticos para cada variable
	static float horaCorrecta;
	static float horaCine1 = 18f;
	static float Corredor = 1;
	static float Sombras = 2;
	static float Jumanji = 3;
	static float precio = 7.5f;
	static float horaCine2 = 22f;
	static float horaCine3 = 16f;

	public static void main(String[] args) {				//empieza el programa

		boolean resultadoCine;								//el escaner sirve para escribir en el teclado
		String siSalir;										//lo declaras y luego lo cierras
		teclado = new Scanner(System.in);					
		System.out.println("Programa Cine v4.");
		System.out.println("Bienvenid@ al sistema de atención para sacar entradas. ");					//texto de entrada
		System.out.println("Seleccione la pelicula que desea ver:");
		System.out.println("(Para seleccionar la pelicula debe escribir el numero correspondiente de esta misma)");

		do {					//do while: haz algo -> hasta que...    ||  haz todas estas funciones...

			System.out.println("1. El corredor del laberinto");
			System.out.println("2. 50 sombras liberadas");								//texto
			System.out.println("3. Jumanji");
			peliculaEscojida = teclado.nextFloat();
			seleccionPelicula();						//Se elije una de las 3 peliculas antes mostradas (Cada una tiene un valor)
			horaLlegada();								//Se escribe la hora estimada de la llegada
			horaRecomendada();							//El programa selecciona una o varias horas a las que puedas ir
			do {										// haz algo 
				horarioCorrecto();
			} while (horaCorrecta != horaCine1 && horaCorrecta != horaCine2 && horaCorrecta != horaCine3);			//hasta que la hora correcta sea igual a una de esas
			pedirDatos();								//precio del dinero
			resultadoCine = comprobarSiVamosAlCine();	//se comparan varias funciones
			comprobarSiVamosAlCine();					//se comprueba si el capital es mayor que el dinero
			dineroInvalido();							//se comprueba si el capital es menor que el dinero
			System.out.println("¿Desea continuar con la compra? (s/n)");		//leer lo que escribes
			teclado.nextLine();
			siSalir = teclado.nextLine();
		} while (siSalir.equals("s") || siSalir.equals("S"));		//hasta que si salir sea igual a "s"
		mostrarResultado(resultadoCine);							// boolean donde true = ir al cine y false = no ir
		System.out.println("Disfrute de la película");
		teclado.close();
	}

	public static void seleccionPelicula() {								
		if (peliculaEscojida == Corredor)
			System.out.println("Usted a elejido El corredor del Laberinto");
		if (peliculaEscojida == Sombras)
			System.out.println("Usted a elejido 50 sombras liberadas");
		if (peliculaEscojida == Jumanji)
			System.out.println("Usted a elejido Jumanji");
		else
			return;

	}

	public static void horaLlegada() {
		System.out.println("Introduzca su hora de llegada estimada al cine.");
		horaLlegada = teclado.nextFloat();
		return;
	}

	public static void horaRecomendada() {
		if (horaLlegada <= horaCine3 - 1)
			System.out.println("La hora estimada que se le recomienda por cercania a la llegada es: " + horaCine3);
		if (horaLlegada <= horaCine1 - 1)
			System.out.println("La hora estimada que se le recomienda por cercania a la llegada es: " + horaCine1);
		if (horaLlegada <= horaCine2 - 1)
			System.out.println("La hora estimada que se le recomienda por cercania a la llegada es: " + horaCine2);
		else
			return;
	}

	public static void horarioCorrecto() {
		horaCorrecta = teclado.nextFloat();
		if (horaCorrecta == horaCine2)
			System.out.println("Hora asignada a " + horaCine2);
		else if (horaCorrecta == horaCine3)
			System.out.println("Hora asignada a " + horaCine3);
		else if (horaCorrecta == horaCine1)
			System.out.println("Hora asignada a " + horaCine1);
		else if (horaCorrecta != horaCine1 && horaCorrecta != horaCine2 && horaCorrecta != horaCine3)
			System.out.println("Pruebe de nuevo");
		else
			return;
	}

	public static void pedirDatos() {
		System.out.println("Introduzca el dinero (Se le recuerda que el coste de la entrada es de 7.50)");
		capital = teclado.nextFloat();
		return;
	}

	public static void dineroInvalido() {
		if (capital < precio)
			System.out.println("Dinero insuficiente, vuelva con más dinero.");
		return;

	}

	public static boolean comprobarSiVamosAlCine() {
		if (capital >= precio)
			return true;
		else
			return false;
	}

	public static void mostrarResultado(boolean resultado) {
		if (resultado == true) {
			System.out.println("Si que podemos ir al cine");
		} else {
			System.out.println("No podemos ir al cine");
		}
	}
}