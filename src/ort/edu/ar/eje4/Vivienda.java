package ort.edu.ar.eje4;

import java.util.ArrayList;

public class Vivienda {
	private Direccion direcccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;

	public Vivienda(String calle, int altura, int piso, char dpto, ArrayList<Persona> personas,
			ArrayList<Mueble> muebles) {
		super();
		this.direcccion = new Direccion(calle, altura, piso, dpto);
		this.personas = personas;
		this.muebles = muebles;
	}

	public Direccion getDirecccion() {
		return direcccion;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public ArrayList<Mueble> getMuebles() {
		return muebles;
	}

	@Override
	public String toString() {
		return "Vivienda [direcccion=" + direcccion + "]";
	}

	public void mostrar(int nroVivienda) {
		System.out.println("\n Vivienda: " + nroVivienda + ": " + this.direcccion.mostrarDireccion() + "\n Personas: "
				+ this.mostrarPersona() + "\n Muebles: " + this.mostrarMueble());
	}

	private ArrayList<String> mostrarPersona() {
		ArrayList<String> lista = new ArrayList<>();
		if (this.personas != null) {
			for (Persona p : this.personas) {
				lista.add(new String(
						"\n" + "Nombre: " + (p.getNombre() + " " + p.getApellido() + ", Edad: " + p.getEdad())));
			}
		}
		return lista;
	}

	private ArrayList<String> mostrarMueble() {
		ArrayList<String> lista = new ArrayList<>();
		if (this.muebles != null) {
			for (Mueble m : this.muebles) {
				lista.add(new String("\n" + (m.getNombre() + " de " + m.getMaterial() + " Color " + m.getColor())));
			}
		}
		return lista;
	}

	public boolean buscarVivienda(int pisoOrigen, char dptoOrigen) {
		return this.direcccion.getPiso() == pisoOrigen && this.direcccion.getDpto() == (dptoOrigen);
	}

	public void ingresarPersonas(ArrayList<Persona> personas) {
		this.personas = personas;

	}

	public void ingresarMuebles(ArrayList<Mueble> muebles) {
		this.muebles = muebles;

	}
}
