import com.incyde.Triangulo;

public class ClaseProgramaPrincipal {

	public static void main(String[] args) {
		Triangulo trianguloAngela = new Triangulo();
		float[] tempLongitudes = {2, 3, 5};
		trianguloAngela.longitudes = tempLongitudes;
		System.out.println("El perimetro es " + trianguloAngela.perimetro());
		trianguloAngela.base = 5f;
		trianguloAngela.altura = 8f;
		System.out.println("El area es " + trianguloAngela.toString());
		System.out.println("El area es " + trianguloAngela.area());
		
		//otro triángulo
		//xxx.base o .altura 
		//e imprimimos con sysout "el area es" + xxxx.area()
		
		Triangulo trianguloGerman = new Triangulo();
		trianguloGerman.base = 2f;
		trianguloGerman.altura = 10f;
		System.out.println("El area del triangulo German es " + trianguloGerman.area());
	}
	
}
