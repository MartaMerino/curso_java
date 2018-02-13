import java.util.Scanner;

/*Programa Cine:
 * Pelicula interensante,dinero,horario,lugar,compañia,transporte
 */

public class ProgramaCineV3 {
	public static void main(String[] args) {
		boolean siIrAlCine = false;
		double precioEntrada = 7.50;
		int horaCine_1 = 21;
		int horaCine_2 = 23;
		System.out.println("Introduzca su nombre");
		
		Scanner escaner = new Scanner(System.in);
		String nombre = escaner.nextLine();
		System.out.println("El nombre es" + nombre + ". Introduzca capital: ");
		double capital = escaner.nextDouble();
		siIrAlCine = siTenemosCapital(precioEntrada, capital);
		if(siIrAlCine)
		    System.out.println("si podemmos ir al cine");
		else
		    System.out.println("no podemos ir al cine");
		escaner.close();
	}
	static boolean siTenemosCapital(double precio,double capital) {
		
		if (capital < precio) {
			return false;
		} else {
			return true;
		}
	
}


   
