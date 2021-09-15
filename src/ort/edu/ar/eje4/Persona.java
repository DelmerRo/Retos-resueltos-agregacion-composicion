package ort.edu.ar.eje4;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad;
	}

	public String mostrar() {
		return this.nombre + "; " + this.apellido + "; " + this.edad;
	}
}
