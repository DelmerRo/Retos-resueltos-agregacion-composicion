package ort.edu.ar.eje5;

import java.util.ArrayList;
import ort.edu.ar.eje4.Mueble;
import ort.edu.ar.eje4.Persona;
import ort.edu.ar.eje4.Vivienda;

public class Edificio {
	private static final int PISO = 4;
	private static final  char DPTO = 'C';
	private ArrayList<Vivienda> listaDeViviendas;

	public Edificio(String calle, int altura) {
		this.listaDeViviendas = crearViviendas(calle, altura);
	}

	private ArrayList<Vivienda> crearViviendas(String calle, int altura) {
		ArrayList<Vivienda> viviendas = new ArrayList<>();
		for (int piso = 0; piso <= PISO; piso++) {
			for (char dpto = 'A'; dpto <= DPTO; dpto++) {
				viviendas.add(new Vivienda(calle, altura, piso, dpto, null, null));
			}
		}
		return viviendas;
	}

	public boolean realizarMudanza(int pisoOrigen, char dptoOrigen, int pisoDestino, char dptoDestino) {
		boolean seMudo=false;
		Vivienda viviendaOrigen = this.obtenerVivienda(pisoOrigen, dptoOrigen);
		if (viviendaOrigen.getPersonas() != null) {
			this.ocuparVivienda(pisoDestino, dptoDestino, viviendaOrigen.getPersonas(), viviendaOrigen.getMuebles());
			this.ocuparVivienda(pisoOrigen, dptoOrigen, null, null);
			seMudo=true;
		}
		return seMudo;
	}

	private Vivienda obtenerVivienda(int pisoOrigen, char dptoOrigen) {
		Vivienda viviendaEncontrada = null;
		int i = 0;
		while (i < this.listaDeViviendas.size() && viviendaEncontrada == null) {
			if (this.listaDeViviendas.get(i).buscarVivienda(pisoOrigen, dptoOrigen)) {
				viviendaEncontrada = this.listaDeViviendas.get(i);
			} else {
				i++;
			}
		}

		return viviendaEncontrada;
	}

	public void ocuparVivienda(int piso, char dpto, ArrayList<Persona> personas, ArrayList<Mueble> muebles) {
		Vivienda vivienda = this.obtenerVivienda(piso, dpto);
		if (vivienda != null) {
			vivienda.ingresarPersonas(personas);
			vivienda.ingresarMuebles(muebles);
		}
	}

	public void mostrarViviendaOcupadas() {
		for (int i = 0; i < this.listaDeViviendas.size(); i++) {
			if (this.listaDeViviendas.get(i).getPersonas() != null) {
				this.listaDeViviendas.get(i).mostrar(i + 1);
			}
		}
	}

	public void mostrarTodo() {
		for (int i = 0; i < this.listaDeViviendas.size(); i++) {
			this.listaDeViviendas.get(i).mostrar(i + 1);
		}

	}

}
