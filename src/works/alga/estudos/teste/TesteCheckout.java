package works.alga.estudos.teste;

import works.alga.estudos.impressaointerface.Impressora;
import works.alga.estudos.impressaointerface.ImpressoraHP;
import works.alga.estudos.pagamentocaixa.Checkout;
import works.alga.estudos.pagamentocaixa.Compra;
import works.alga.estudos.pagamentointerface.Cartao;
import works.alga.estudos.pagamentointerface.Operadora;
import works.alga.estudos.pagamentointerface.RedeCard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("Joao M Couves");
		cartao.setNumeroCartao("456");
		
		
		Compra compra = new Compra();
		compra.setNomeCliente("Joao Mendonça Couves");
		compra.setProduto("Guaraná 1L");
		compra.setValorTotal(6.5);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
	}

}
