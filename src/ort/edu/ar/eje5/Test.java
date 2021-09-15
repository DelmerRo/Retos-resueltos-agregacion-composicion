package ort.edu.ar.eje5;

import java.util.ArrayList;

import ort.edu.ar.eje4.Mueble;
import ort.edu.ar.eje4.Persona;

public class Test {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Arturo", "Roman", 53));
		personas.add(new Persona("Monica", "Gaztambide", 35));

		ArrayList<Mueble> muebles = new ArrayList<>();
		muebles.add(new Mueble("Mesa ", "madera", "marron"));
		muebles.add(new Mueble("Mesada", "marmol", "rojo"));
		muebles.add(new Mueble("Perchero", "metal", "negro"));
		muebles.add(new Mueble("Sillon", "cuero", "azul"));

		Edificio edificio = new Edificio("Blanco Encalada", 1542);
		edificio.ocuparVivienda(4, 'C', personas, muebles);

		System.out.println("/////////VIVIENDAS OCUPADAS/////////");
		edificio.mostrarViviendaOcupadas();
		System.out.println("\n/////////TODAS LAS VIVIENDAS/////////");
		edificio.mostrarTodo();
		System.out.println("/////////REALIZANDO MUDANZA/////////");
		System.out.println(edificio.realizarMudanza(4, 'C', 2, 'A'));
		System.out.println("\n/////////SE REALIZO MUDANZA/////////");
		edificio.mostrarTodo();

	}

}
