import java.util.Scanner;

public class Ejercicio_1 {

public static void main(String[] args) {
// 1. Leer un n�mero y mostrar por la salida est�ndar si dicho n�mero es o no es par.
	
		Scanner reader = new Scanner(System.in);
	
			int num=0;		int x=0;
			
		System.out.println("Introduce el n�mero que quieras comprobar si es par o impar");
	
						num= reader.nextInt();
							x=num%2;
							
		if (x==0){
		System.out.println("El n�mero "+num+ " es par");				
		}else
		System.out.println("El n�mero "+num+ " es impar");

	}

}
