package reto3acincprogbas;

public class Persona {
	private String identificacion, nombre;
	private boolean extranjero;
	private int estrato,edad;
	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public boolean getExtranjero() {
		return this.extranjero;
	}

	public void setExtranjero(boolean extranjero) {
		this.extranjero = extranjero;
	}
	
	public int getEstrato() {
		return this.estrato;
	}

	public void setEstrato(int estrato) {
		if (estrato < 1 || estrato > 5) {
			this.estrato = 0;
		} else {
			this.estrato = estrato;
		}
	}	

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		if (edad <= 2) {
			this.edad = 0;
		} else {
			this.edad = edad;
		}
	}	


}
