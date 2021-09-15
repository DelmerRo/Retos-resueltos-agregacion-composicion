package ort.edu.ar.eje1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Persona persona = new Persona("Delmer", "Rodriguez");
		Persona persona1 = new Persona("Maria", "Gonzales");
		Persona persona2 = new Persona("Manuel", "Costales");
		Persona persona3 = new Persona("Felipe", "Rodriguez");
		Persona persona4 = new Persona("David", "Soto");
		Persona persona5 = new Persona("Vanessa", "Fuentes");
		Persona persona6 = new Persona("Matias", "Puelo");
		ArrayList<Persona> listaDePersonas = new ArrayList<>();
		ArrayList<Persona> listaDePersonas1 = new ArrayList<>();
		ArrayList<Persona> listaDePersonas2 = new ArrayList<>();
		ArrayList<Persona> listaDePersonas3 = new ArrayList<>();

		listaDePersonas.add(persona);
		listaDePersonas1.add(persona1);
		listaDePersonas2.add(persona2);
		listaDePersonas2.add(persona3);
		listaDePersonas3.add(persona4);
		listaDePersonas3.add(persona5);
		listaDePersonas3.add(persona6);

		EMail email = new EMail("jindrg@gmail.com");
		EMail email1 = new EMail("Delmer@outlook.com");

		NumeroTelefonico nt = new NumeroTelefonico(15, 1122540454, 54, TipoDeLinea.CELULAR);
		NumeroTelefonico nt1 = new NumeroTelefonico(11, 1168062288, 51, TipoDeLinea.FIJO);

		persona.agregarEmail(email);
		persona.agregarEmail(email1);

		persona.agregarNumTel(nt);
		persona.agregarNumTel(nt1);

		persona.mostrarTodo();
	}
}
