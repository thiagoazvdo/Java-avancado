package works.alga.estudos.documentacao;

/**
 * Representa um funcionário da empresa...
 * 
 * @author Thiago Azevedo
 *
 */
public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
	 * 
	 * <p>
	 * O valor da diaria é calculado dividindo-se o <b> salario base por 30 (dias do
	 * mes)</b>.
	 * </p>
	 * 
	 * Caso o destino seja uma capital e adicionado 20% no valor do adiantamento.
	 * 
	 * @param dias    Quantidade de dias da viagem
	 * 
	 * @param capital Indica ou não se é uma capital brasileira
	 * 
	 * @return
	 * 
	 * @throws IllegalArgumentExecption Caso dias for menor ou igual a zero
	 * 
	 * @see    Viagem
	 * 
	 * @since 1.1.0
	 */

	public double adiantamentoViagem(int dias, boolean capital) {
		double valorDiaria = salario / 30;
		double valorAdiantamento = valorDiaria * dias;
		if (capital) {
			valorAdiantamento *= 1.20;
		}
		return valorAdiantamento;
	}

}
