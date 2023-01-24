package works.alga.estudos.corretoradeseguros;

public class Notebook implements Seguravel {

	private int anoFabricacao;
	private double valorMercado;
	
	public Notebook(int anoFabricacao, double valorMercado) {
		this.anoFabricacao = anoFabricacao;
		this.valorMercado = valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		double apolice = this.valorMercado * 0.25;
		return apolice;
	}

	@Override
	public String obterDescricao() {
		return "notebook de valor de mercado = " + this.valorMercado
				+ " e apolice de " + this.calcularValorApolice();
	}

}
