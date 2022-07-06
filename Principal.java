package reto3acincprogbas;

public class Principal {

	// Reto 2 Programacion básica MinTic
	// Apoyo para captura de notas en java
	// AC_Inc
	// Docente Deivis Martinez Acosta
	public static void main(String[] args) {
		int cantidad;
		System.out.println("Apoyo para captura de notas en JAVA");
		System.out.println("-----------------------------------\n\n");
		System.out.print("Digite cantidad de estudiantes a registrar:  ");
		cantidad = Captura.cantidad();
		Estudiante[] estudiantes = new Estudiante[cantidad];		
		estudiantes = Captura.leerEstudiante(cantidad);
		Imprimir.resultados(estudiantes, cantidad);				
	}

}
