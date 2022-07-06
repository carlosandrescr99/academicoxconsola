package reto3acincprogbas;

import java.text.DecimalFormat;

public class Imprimir {

	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void resultados(Estudiante[] estudiantes, int cantidad) {
		System.out.println("____________________________________________________");
		String[] estrato = { "Ultra Bajo", "Bajo-bajo", "Bajo", "Medio-Bajo", "Medio", "Medio Alto", "Alto" };
		int MATRICULA = 630000;
		Double promedio, descuento = 0.0, dctoTotal = 0.0;
		for (Estudiante estudiante : estudiantes) {
			descuento = 0.0;
			System.out.println();
			System.out.println("ID\tNOMBRE\tEDAD\tEXTRANJERO\tESTRATO");
			System.out.println(estudiante.getIdentificacion() + "\t" + estudiante.getNombre() + "\t"
					+ estudiante.getEdad() + "\t" + estudiante.getExtranjero() + "\t\t" + estrato[estudiante.getEstrato()]);
			promedio = (estudiante.getNota()[0] * 0.3) + (estudiante.getNota()[1] * 0.3)
					+ (estudiante.getNota()[2] * 0.4);
			if (estudiante.getExtranjero()==false) {
				descuento = Descuentos.descuento(promedio, estudiante.getEdad(), estudiante.getEstrato());
			}else {
				descuento = Descuentos.descuento(promedio, estudiante.getEdad());
			}
			
			System.out.println("N-1:  " + df.format(estudiante.getNota()[0]) + "   N-2:  "
					+ df.format(estudiante.getNota()[1]) + "   N-3:  " + df.format(estudiante.getNota()[2]) + "   PROM:  "
					+ df.format(promedio) + "   DSC/TO:  " + descuento + "   VRxPAGAR:  " + (MATRICULA - descuento));
			dctoTotal = descuento + dctoTotal;
		}
		System.out.println("El total de los descuentos es: $ " + dctoTotal);
	}

}
