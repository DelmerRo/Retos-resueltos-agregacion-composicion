package ort.edu.ar.eje3;

import java.util.ArrayList;

import ort.edu.ar.eje1.EMail;
import ort.edu.ar.eje1.NumeroTelefonico;
import ort.edu.ar.eje1.Persona;
import ort.edu.ar.eje1.TipoDeLinea;
import ort.edu.ar.eje2.Mascota;

public class Test {
	public static void main(String[] args) {
		Persona persona=new Persona("Delmer", "Rodriguez");
		Persona persona1=new Persona("Maria", "Gonzales");
		Persona persona2=new Persona("Manuel", "Costales");
		Persona persona3=new Persona("Felipe", "Rodriguez");
		Persona persona4=new Persona("David", "Soto");
		Persona persona5=new Persona("Vanessa", "Fuentes");
		Persona persona6=new Persona("Matias", "Puelo");
		ArrayList<Persona>listaDePersonas=new ArrayList<>();
		ArrayList<Persona>listaDePersonas1=new ArrayList<>();
		ArrayList<Persona>listaDePersonas2=new ArrayList<>();
		ArrayList<Persona>listaDePersonas3=new ArrayList<>();
		
		listaDePersonas.add(persona);
		listaDePersonas1.add(persona1);
		listaDePersonas2.add(persona2);
		listaDePersonas2.add(persona3);
		listaDePersonas3.add(persona4);
		listaDePersonas3.add(persona5);
		listaDePersonas3.add(persona6);
		
		EMail email=new EMail("jindrg@gmail.com");
		EMail email1=new EMail("Delmer@outlook.com");
		
		NumeroTelefonico nt=new NumeroTelefonico(15, 1122540454, 54, TipoDeLinea.CELULAR);
		NumeroTelefonico nt1=new NumeroTelefonico(11, 1168062288, 51, TipoDeLinea.FIJO);
		
		Mascota mascota=new Mascota("Felipe", "Gato");
		Mascota mascota1=new Mascota("Galo", "Perro");
		Mascota mascota2=new Mascota("Peri","Ave");
		
		Hito hito1=new Hito("12052011", "Recuerdo de Fiesta", listaDePersonas1);
		Hito hito2=new Hito("12052011", "Recuerdo de Fiesta", listaDePersonas2);
		Hito hito3=new Hito("12052011", "Recuerdo de Fiesta", listaDePersonas3);
		
		persona.agregarEmail(email);
		persona.agregarEmail(email1);
		
		persona.agregarNumTel(nt);
		persona.agregarNumTel(nt1);
		
		persona.agregarMascota(mascota);
		persona.agregarMascota(mascota1);
		persona.agregarMascota(mascota2);
		persona.eliminarMascota(mascota2);
		persona.mostrarTodo();
		persona.agregarHito(hito3);
		persona.agregarHito(hito1);
		persona1.agregarHito(hito2);
		persona2.agregarHito(hito3);
		
		persona.mostrarTodo();
		persona.mostrarHitos();
}
}