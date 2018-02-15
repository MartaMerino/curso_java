package EjemplosFechas;

import java.util.Date;

public class EjemploFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date fechaAyer = new Date ();
		fechaAyer.setHours(11);
		fechaAyer.setDate(12);
		
		System.out.println(" Fecha -> " + fechaAyer.toString());
		int hora = fechaAyer.getHours();
		System.out.println("Hora" + hora);
		
		Date fechaHoy =new Date ();
		if (fechaAyer.before(fechaHoy));
		System.out.println(fechaAyer + " es anterior a " + fechaHoy);
		
		if (fechaHoy.after(fechaAyer));
			System.out.println(fechaAyer + " es posterior a " + fechaHoy);
		
		
	}

}
