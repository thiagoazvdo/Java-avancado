package works.alga.estudos.collections.desafio;

import java.math.BigDecimal;
import java.util.Objects;

public class Cargo {
	
	private String descricao;
	private BigDecimal salario;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(salario, other.salario);
	}
	
	

}
