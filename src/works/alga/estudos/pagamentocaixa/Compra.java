package works.alga.estudos.pagamentocaixa;

import works.alga.estudos.impressaointerface.Imprimivel;
import works.alga.estudos.pagamentointerface.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	/*sobrescrito da interface autorizavel*/
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}
	
	@Override
	public String getCabecalhoPagina() {
		// TODO Auto-generated method stub
		return this.getProduto() + " = " + this.getValorTotal();
	}


	@Override
	public String getCoproPagina() {
		// TODO Auto-generated method stub
		return this.getNomeCliente();
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
