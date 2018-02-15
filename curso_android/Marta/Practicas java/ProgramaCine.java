/*
Archivo ProgramaCine.JavaCodebaseComponent
Autor Pablo Fernandez Mena
Descripcion Programa que nos ayuda a saber si ir al cine o no
*/
// Inicio de la clase ProgramaCine
public class ProgramaCine {
		//Metodo principal que se llama al arrancar el proceso
	public static void main(String[] argumentos)
	
	{	//Instrucciones de salida				
		System.out.println ("Mi primer programa");
		System.out.println ("PROGRAMA CINE");
	
	String Titulo = "torrente 5";		//Titulo variable de texto
	boolean varSiIrAlCine = false;		//Resultado para saber el boolean
	int precioEntrada = 9;				//Precio entrada
	int nuestroCapital = 40;				//El dinero que tenemos
	
	
	// Imprimiendo el titulo
	System.out.println ("Titulo " + Titulo );

	
	System.out.println ("Precio " + precioEntrada);
	
	if (nuestroCapital > precioEntrada) 
		varSiIrAlCine = true;
		
	 else 
		varSiIrAlCine = false;
		
	if (varSiIrAlCine == true) {
		System.out.println ("SI Podriamos ir al cine");
		nuestroCapital = nuestroCapital - precioEntrada;
		System.out.println ("Capital final " + nuestroCapital
);
	} else {
		System.out.println ("NO poriamos ir al cine");
	}
	
	
	
	
	}
}