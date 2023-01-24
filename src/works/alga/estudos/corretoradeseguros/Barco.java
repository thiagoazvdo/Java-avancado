package works.alga.estudos.corretoradeseguros;

public class Barco implements Seguravel {

	private int ano;
	private double valorMercado;
		
	
	public Barco(int ano, double valorMercado) {
		this.ano = ano;
		this.valorMercado = valorMercado;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = valorMercado * 0.5;
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "barco de pequeno porte do ano " + this.ano
				+ " e valor de mercado de " + this.valorMercado;
	}

}
