package ort.edu.ar.eje1;

public class EMail {

	private String cuenta;
	private String dominio;
	private String separador = "@";
	private String textoSeparado[];

	public EMail(String mail) {
		textoSeparado = mail.split(this.separador);
		this.cuenta = textoSeparado[0];
		this.dominio = textoSeparado[1];
	}

	public String getValor() {
		return "\n" + this.cuenta + this.separador + this.dominio;
	}

}
