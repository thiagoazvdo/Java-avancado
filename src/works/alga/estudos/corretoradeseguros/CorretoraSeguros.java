package works.alga.estudos.corretoradeseguros;

public class CorretoraSeguros {
	
	/*essa classe eh responsavel por fazer a proposta de seguro
	 *do bem seguravel e mostrar na tela*/
	
	public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
		System.out.println("----------------------------------");
		System.out.println("corretora de seguros - proposta ");
		System.out.println("----------------------------------");
		System.out.println(objetoSeguravel.obterDescricao());
		System.out.println("valor da apolice: " + objetoSeguravel.calcularValorApolice());
		System.out.println("----------------------------------");
	}
	/*percebamos que o metodo fazerpropostaseguro recebe um objeto seguravel
	 *ou seja, pode ser um carro, imovel ou qualquer outro objeto que implemente
	 *a interface seguravel*/
}
