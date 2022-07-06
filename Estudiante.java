package reto3acincprogbas;



public class Estudiante extends Persona {
	private double[] nota = new double[3];

	public double[] getNota() {
		return this.nota;
	}

	public void setNota(double nota[]) {
		for (int i = 0; i<3;i++) {
			if (nota[i] < 0 || nota[i] > 5) {
				this.nota[i] = 0;
			} else {
				this.nota[i] = nota[i];
			}
		}
	}

}
