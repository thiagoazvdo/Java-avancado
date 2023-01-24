package works.alga.estudos.pagamentocaixa;

import works.alga.estudos.impressaointerface.Impressora;
import works.alga.estudos.pagamentointerface.Cartao;
import works.alga.estudos.pagamentointerface.Operadora;

public class Checkout {
	
	private Operadora operadora;
	private Impressora impressora;
	
	public Checkout(Operadora operadora, Impressora impressora) {
		//super();
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado) {
			this.impressora.imprimir(compra);
		}
		else {
			System.out.println("o pagamento foi negado!");
		}
	}

}
