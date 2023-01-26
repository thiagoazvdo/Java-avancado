package works.alga.estudos.gson;
//NECESSARIO ADICIONAR LIB (JAR) GSON - E ADICIONAR AO BUILD PATH 

public class Endereco {

	private String rua;
	private String cidade;
	private String estado;

	public Endereco() {
	}

	public Endereco(String rua, String cidade, String estado) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
