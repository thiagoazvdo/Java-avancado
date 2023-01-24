package works.alga.estudos.collections.desafio;

import java.util.Objects;

public class Politico {
	
	private String nome;
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cargo, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Politico other = (Politico) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(nome, other.nome);
	}
	
	

}
