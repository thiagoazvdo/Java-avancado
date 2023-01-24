package works.alga.estudos.corretoradeseguros;

public class Imovel implements Seguravel {
	
	/*como essa classe implementa seguravel temos que implementar
	 *os metodos definidos na interface*/
	
	private double valorMercado;
	private int areaConstruida;

	public Imovel(double valorMercado, int areaConstruida) {
		this.valorMercado = valorMercado;
		this.areaConstruida = areaConstruida;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.03;
		valorApolice = valorApolice + (areaConstruida * 0.5);
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		// TODO Auto-generated method stub
		return "imóvel com área construída de " + this.areaConstruida
				+ "m2 e valor de mercado de " + this.valorMercado;
	}

}
