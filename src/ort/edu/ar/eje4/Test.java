package ort.edu.ar.eje4;

import java.util.ArrayList;

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

		Vivienda viv=new Vivienda("Montañeses", 1234, 4, 'C', personas, muebles);
		viv.mostrar(0);
	}

}
