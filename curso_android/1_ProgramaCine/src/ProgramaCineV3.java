import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;
//Programa cine
// Pelicula interesante, dinero, horario, compañia 
public class ProgramaCineV3 {
public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int peliculas=0; 		int horario=0;		int contador=0;
 		int gente=1;			int dinero=7;		int entrada=0;
		int x=0;		
		
		
	System.out.println("Bienvenido a Cinesa, Tenemos en cartelera a: Avatar , Torrente 5, Soy Leyenda, te interesa alguna de estas peliculas, si deseas ver toda la cartelera pulsa 1");
		
		peliculas = reader.nextInt();
		
	if (peliculas==1) {
		System.out.println("Avatar, Torrente 5,Soy Leyenda,Los pitufos, Los vengadores, si te interesan algunas de estas peliculas pulsa 1 sino es asi, pulsa 2" );
			
		x = reader.nextInt();
		
	}
	if (x==1){
		
		System.out.println("La entrada cuesta 7€,Si quiere comprar una entrada dale al 1, si vas a tener otro acompañante pulsa 2");
		 
		gente = reader.nextInt();
	
	}
		if(gente!=1){
			
		System.out.println("Indica cuantos acompañantes van");

					gente = reader.nextInt();
					
					dinero=gente*entrada;
					
		System.out.println("Las entradas costarán " + dinero+ "€");
			
		System.out.println("Indica a que hora quieres ir, tenemos estos horarios disponibles: 15,16,18,20,21");
		
					horario = reader.nextInt();
	
			if(horario==15){
				
			 
				System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);
				System.out.println("Esperemos que vuelva pronto a CINESA");

			}		
			
			if(horario==16){
				
				  
				System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);
				System.out.println("Esperemos que vuelva pronto a CINESA");

			}		
			if(horario==18){
				
				 
				System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);
				System.out.println("Esperemos que vuelva pronto a CINESA");

			}		
			if(horario==20){
				
				 
				System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);
				System.out.println("Esperemos que vuelva pronto a CINESA");

			}		
			if(horario==21){
				
				  
				System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);
				System.out.println("Esperemos que vuelva pronto a CINESA");
	
			}		

	}else 	
		 System.out.println("Has comprado "+gente+" con un coste total de "+dinero+" a la hora de: "+horario);

		 System.out.println("Esperemos que vuelva pronto a CINESA");
		
	}
}
