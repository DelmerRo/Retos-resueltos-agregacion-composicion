package ort.edu.ar.eje4;

public class Mueble {
	private String nombre;
	private String material;
	private String color;

	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", material=" + material + ", color=" + color;
	}

	public String mostrar() {
		return this.nombre + "; " + this.material + "; " + this.color;
	}
}
