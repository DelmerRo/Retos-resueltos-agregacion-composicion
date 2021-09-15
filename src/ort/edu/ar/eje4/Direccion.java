package ort.edu.ar.eje4;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private char dpto;

	public Direccion(String calle, int altura, int piso, char dpto) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.dpto = dpto;
	}

	public Direccion(String calle, int altura) {
		this.calle = calle;
		this.altura = altura;
	}

	public String getCalle() {
		return calle;
	}

	public int getAltura() {
		return altura;
	}

	public int getPiso() {
		return piso;
	}

	public char getDpto() {
		return dpto;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", altura=" + altura + ", piso=" + piso + ", dpto=" + dpto + "]";
	}

	public String mostrarDireccion() {
		return this.calle + " " + this.altura + " " + this.piso + "°" + this.dpto;
	}
}
