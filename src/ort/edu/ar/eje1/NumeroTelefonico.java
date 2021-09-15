package ort.edu.ar.eje1;

public class NumeroTelefonico {
private int caracteristicas;
private int numeroDeAbonado;
private int codigoDePais;
private TipoDeLinea tipoDeLinea;
public NumeroTelefonico(int caracteristicas, int numeroDeAbonado, int codigoDePais, TipoDeLinea tipoDeLinea) {
	super();
	this.caracteristicas = caracteristicas;
	this.numeroDeAbonado = numeroDeAbonado;
	this.codigoDePais = codigoDePais;
	this.tipoDeLinea = tipoDeLinea;
}

public String getValor() {
	String texto="\n"+this.tipoDeLinea+": +"+this.codigoDePais+"-"+this.caracteristicas+"-"+this.numeroDeAbonado;
	return texto ;	
}

}
