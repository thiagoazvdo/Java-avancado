package works.alga.estudos.gson;
//NECESSARIO ADICIONAR LIB (JAR) GSON - E ADICIONAR AO BUILD PATH 

public class Telefone {

	private String tipo;
	private String numero;

	public Telefone(String tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public Telefone() {
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
