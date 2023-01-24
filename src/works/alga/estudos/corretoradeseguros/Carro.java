package works.alga.estudos.corretoradeseguros;

public class Carro implements Seguravel {
	
	/*como essa classe implementa seguravel temos que implementar
	 *os metodos definidos na interface*/
	
	private double valorMercado;
	private int anoFabricacao;


	public Carro(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		//calculos ficticios do valor da apolice de um carro
		double valorApolice = this.valorMercado * 0.04;
		if (anoFabricacao < 2000) {
			valorApolice = valorApolice * 0.9;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "carro ano " + this.anoFabricacao + 
				" com valor de mercado " + this.valorMercado;
	}

}
