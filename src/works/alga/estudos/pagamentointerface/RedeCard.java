package works.alga.estudos.pagamentointerface;

public class RedeCard implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {		
		return cartao.getNumeroCartao().startsWith("456") 
				&& autorizavel.getValorTotal() < 100;
	}

}
