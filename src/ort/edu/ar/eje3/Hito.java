package ort.edu.ar.eje3;

import java.util.ArrayList;

import ort.edu.ar.eje1.Persona;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;

	public Hito(String fecha, String descripcion, ArrayList<Persona> personasInvolucradas) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = personasInvolucradas;
	}

	@Override
	public String toString() {
		return "Hito [fecha=" + fecha + ", descripcion=" + descripcion + ", personasInvolucradas="
				+ personasInvolucradas + "]";
	}
}
