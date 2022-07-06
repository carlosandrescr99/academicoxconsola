package reto3acincprogbas;

import java.util.Scanner;

public class Captura {
	public static int cantidad() {
		int cantidad;
		do {
			cantidad=Validador.returnInt();
			if (cantidad<=0) {
				System.out.println("Cantidad minima 1 digita nuevamente");
				cantidad=0;
			}
		} while (cantidad==0);
		return cantidad;
	}
	public static Estudiante[] leerEstudiante(int cantidad) {
		Scanner sc = new Scanner(System.in);
		Estudiante[] estudiantes = new Estudiante[cantidad];
		Estudiante estudiante;
		String identificacion, nombre;
		boolean extranjero = true;
		double[] nota = new double[3];
		int estrato,edad;
		for (int i = 0; i < cantidad; i++) {
			int x =1;
			estudiante = new Estudiante();
			System.out.print("Digite 1.Extranjero 2.Nacional:  ");
			do {
				int respuesta;
				respuesta = Validador.returnInt();
				if (respuesta == 1){
					extranjero = true;
					x=0;
					System.out.println("entra");
				}else if (respuesta == 2){
					extranjero = false;
					x=0;
					System.out.println("entra2");
				}
			}while (x == 1);
			
			System.out.print("Digite la identificación del estudiante:  ");
			identificacion = sc.nextLine();	
			System.out.print("Digite el nombre del estudiante:  ");
			nombre = sc.nextLine();
			System.out.print("Digite la edad del estudiante:  ");
			do {
				edad = Validador.returnInt();
				if (edad <= 4) {
					System.out.println("Edad fuera de rango solo mayor de 4 años");
					edad = 0;
				}
			}while (edad == 0);
			System.out.print("Digite el estrato del estudiante:  ");
			do {
				estrato = Validador.returnInt();
				if (estrato < 0 || estrato > 6) {
					System.out.println("Estrato fuera de rango");
					estrato = -1;
				}
			}while (estrato == -1);
			System.out.print("Digite las notas del estudiante:  ");
			nota = notas();
			estudiante.setIdentificacion(identificacion);
			estudiante.setNombre(nombre);
			estudiante.setEstrato(estrato);
			estudiante.setExtranjero(extranjero);
			estudiante.setEdad(edad);
			estudiante.setNota(nota);
			estudiantes[i]=estudiante;
		}
		return estudiantes;
	}
	public static double[] notas() {
		double[] nota = new double[3];
		for (int i = 0; i < 3;i++) {
			do {
				System.out.print("Nota "+(i+1)+":  "); 
				nota[i] = Validador.returnDouble();
				if (nota[i] < 0 || nota[i] > 5) {
					System.out.println("Nota fuera de rango  ");
					nota[i] = -1;
				}
			}while (nota[i] == -1);			
		}
		return nota;
	}
}
