
package ort.edu.ar.eje1;

import java.util.ArrayList;

import ort.edu.ar.eje2.Mascota;
import ort.edu.ar.eje3.Hito;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> numerosTelefonicos;
	private ArrayList<EMail> Emails;
	private ArrayList<Mascota> mascotas;
	private ArrayList<Hito> hitos;

	public Persona(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.numerosTelefonicos = new ArrayList<>();
		this.Emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
		this.hitos = new ArrayList<>();
	}

	public void mostrarTodo() {
		System.out.println(this.nombre + ", " + this.apellido + "\nTelefono, Celular: " + this.mostrarNT() + "\nEmail: "
				+ this.mostrarEmail() + "\nMascotas: " + this.mascotas);
	}

	private ArrayList<String> mostrarEmail() {
		ArrayList<String> lista = new ArrayList<>();
		for (EMail email : this.Emails) {
			lista.add(email.getValor());
		}
		return lista;
	}

	private ArrayList<String> mostrarNT() {
		ArrayList<String> lista = new ArrayList<>();
		for (NumeroTelefonico NT : this.numerosTelefonicos) {
			lista.add(NT.getValor());
		}
		return lista;
	}

	@Override
	public String toString() {
		return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
	}

	public void agregarEmail(EMail correo) {
		this.Emails.add(correo);
	}

	public void agregarNumTel(NumeroTelefonico numTel) {
		this.numerosTelefonicos.add(numTel);

	}

	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);

	}

	public void agregarHito(Hito hito) {
		this.hitos.add(hito);
	}

	public void eliminarMascota(Mascota mascota) {
		this.mascotas.remove(mascota);
		
	}

	public void mostrarHitos() {
	for(Hito hito:this.hitos) {
		System.out.println(hito);
	}
		
	}

}
