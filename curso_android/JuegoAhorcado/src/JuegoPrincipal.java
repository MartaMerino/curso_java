
public class JuegoPrincipal {
	
	static String palabraElegida;
	static String letra = VistayTeclado.pedirLetra();
	
public static void main(String[] args) {
		
		palabraElegida = ListaPalabras.palabraAleatoria();
		System.out.println("La palabra es" + ListaPalabras.palabraAleatoria());
		System.out.println("La letra es " + letra);
		longitudPalabra = palabraElegida.lenght(;)
		guiones = "_ _ _ _ _ _ _ _".substring(0, longitudPalabra * 2);
		System.out.println("_ _ _ _ _ _ _ _");
		System.out.println("_ _ _ _ _ _ _ _".substring(0, 5));
		System.out.println(palabraElegida.length());
		
		
		
		/* System.out.println(palabraElegida.charAt(0));
		 
		 if (palabraElegida.contains(letra)) {
			System.out.println(" Si que contiene "); 
		} else {
				System.out.println(" No contiene ");
		}
		System.out.println("Indice: " + palabraElegida.indexOf(letra));
		*/
	}
	
}
