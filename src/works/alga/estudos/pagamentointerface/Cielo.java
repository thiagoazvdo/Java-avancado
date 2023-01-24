package works.alga.estudos.pagamentointerface;

public class Cielo implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}
	/*verificando se o numero do cartao inicia com 123 e se o valor eh menor
	 *que o limite de 100*/
}
