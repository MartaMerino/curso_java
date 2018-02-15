
import java.util.Scanner;

public class ProgramaCinev3 {


	public static void main(String[] args) {
		
		boolean siIrAlCine = false;		
		boolean siTenemosDinero = false;
		boolean siHaydisponible = false;
		boolean siHayJornada_1 = false;
		boolean siHayJornada_2 = false;
		
		double precioEntrada = 7.50;
		double horaCine_1 = 18.0 ;
		double horaCine_2 = 22.0 ;
		
		
		System.out.println("Introduzca su nombre ");
		Scanner escaner = new Scanner(System.in);
		String nombre = escaner.nextLine();
		System.out.println("El nombre es " + nombre + " Introduzca capital:");
						
		double capital = escaner .nextInt(); 
	
		System.out.println("Introduzca la hora ");
		Scanner hora = new Scanner(System.in);
		double horario = hora.nextDouble();
		System.out.println("El horario es: " + horaCine_1 + "ó " + horaCine_2);
		
		double horario1 = hora .nextInt(); 
		
		siHayJornada1(horaCine_1, horario1);
		if (siHayJornada_1)
			System.out.println("Pruebe con 22:00");
		else
			System.out.println("Asignado a 18:00");
		
		siHayJornada2(horaCine_2, horario1);
		if (siHayJornada_1)
			System.out.println();
		
		siTenemosCapital(precioEntrada, capital);
		if (siIrAlCine)
			System.out.println("No podemos ir al cine");
		else
			System.out.println("Si podemos ir al cine");
			
		siHaydisponible = siTenemosCapital(precioEntrada, capital);
		siHayJornada_1 = siHayJornada1 (horaCine_1, horaCine_2);
		siHayJornada_2 = siHayJornada2 (horaCine_1, horaCine_2);
		siIrAlCine = siHaydisponible || siTenemosDinero;
		
	escaner .close();
	}
	static boolean siHayJornada1(double horaCine_1, double horario1) {
		if ( horario1  == horaCine_1) 
			{ return false; }
		else 
			{ return true; }
	}
	static boolean siHayJornada2(double horaCine_2, double horario1) {
		if (horario1 == horaCine_2)
			{ return false; }
		else
			{ return true; }
	}
	static boolean siTenemosCapital(double precio, double capital) {
		if ( capital < precio) 
			{ return false; }
		 else 
			{ return true; }
			
		}
		
}


