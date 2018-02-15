public class ProgramaCine
{
                public static void main(String[] argumentos)
                {
                  String titulo = "pelicula";
				  boolean cine = false;
				  int entrada =9;
				  int dinero =40;  
				  
		System.out.println ("Programa Cine");
				  
		System.out.println ("titlo " + titulo +".");
				  
				  System.out.println ("Precio: " + entrada);
				  
					if(dinero > entrada) {
						cine = true;
					}else {
						cine = false;
					}
					
					if(cine == true) {
						System.out.println("Si podriamos ir al cine");
						dinero = dinero - precio;
					}else {
						System.out.println("No podriamos ir al cine");
					}
				 				  
                }
}

